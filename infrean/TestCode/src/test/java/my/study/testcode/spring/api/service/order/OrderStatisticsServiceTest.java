package my.study.testcode.spring.api.service.order;

import my.study.testcode.spring.client.mail.MailSendClient;
import my.study.testcode.spring.client.mail.MailSendHistoryRepository;
import my.study.testcode.spring.domain.history.mail.MailSendHistory;
import my.study.testcode.spring.domain.order.Order;
import my.study.testcode.spring.domain.order.OrderRepository;
import my.study.testcode.spring.domain.orderproduct.OrderProductRepository;
import my.study.testcode.spring.domain.product.Product;
import my.study.testcode.spring.domain.product.ProductRepository;
import my.study.testcode.spring.domain.product.ProductSellingStatus;
import my.study.testcode.spring.domain.product.ProductType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static my.study.testcode.spring.domain.order.OrderStatus.PAYMENT_COMPLETED;
import static my.study.testcode.spring.domain.order.OrderStatus.PAYMENT_FAILED;
import static my.study.testcode.spring.domain.product.ProductSellingStatus.SELLING;
import static my.study.testcode.spring.domain.product.ProductType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class OrderStatisticsServiceTest {

    @Autowired
    private OrderProductRepository orderProductRepository;

    @Autowired
    private OrderStatisticsService orderStatisticsService;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private MailSendHistoryRepository mailSendHistoryRepository;

    @MockBean
    private MailSendClient mailSendClient;

    @AfterEach
    void tearDown() {
        orderProductRepository.deleteAllInBatch();
        orderRepository.deleteAllInBatch();
        productRepository.deleteAllInBatch();
        mailSendHistoryRepository.deleteAllInBatch();
    }

    @DisplayName("결제완료 주문들을 조회하여 매출 통계 매일을 전송한다.")
    @Test
    void sendOrderStatisticsMail() {
        // given
        LocalDateTime now = LocalDateTime.of(2023, 3, 5, 0, 0);

        Product product1 = createProduct(HANDMADE, "001", 1000);
        Product product2 = createProduct(HANDMADE, "002", 3000);
        Product product3 = createProduct(HANDMADE, "003", 5000);
        List<Product> products = productRepository.saveAll(List.of(product1, product2, product3));

        Order order1 = Order.create(products, LocalDateTime.of(2023,3,4,23,59,59));
        order1.setOrderStatus(PAYMENT_COMPLETED);
        Order order2 = Order.create(products, now);
        order2.setOrderStatus(PAYMENT_FAILED);
        Order order3 = Order.create(products, LocalDateTime.of(2023,3,5,23,59,59));
        order3.setOrderStatus(PAYMENT_COMPLETED);
        Order order4 = Order.create(products, LocalDateTime.of(2023,3,6,0,0));
        order4.setOrderStatus(PAYMENT_COMPLETED);

        orderRepository.saveAll(List.of(order1, order2, order3));

        // stubbing
        Mockito.when(mailSendClient.sendEmail(any(String.class), any(String.class),any(String.class),any(String.class)))
                .thenReturn(true);

        // when
        boolean result = orderStatisticsService.sendOrderStatisticsMail(LocalDate.of(2023, 3, 5), "test@test.com");

        // then
        assertThat(result).isTrue();

        List<MailSendHistory> histories = mailSendHistoryRepository.findAll();

        assertThat(histories).hasSize(1)
                .extracting("content")
                .contains("총 매출 합계는 9000원 입니다.");
    }

    private Product createProduct(ProductType type, String productNumber, int price) {
        return Product.builder()
                .type(type)
                .productNumber(productNumber)
                .price(price)
                .sellingStatus(SELLING)
                .name("메뉴 이름")
                .build();
    }
}