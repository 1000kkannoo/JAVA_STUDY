package my.study.testcode.spring.domain.order;

import my.study.testcode.spring.IntegrationTestSupport;
import my.study.testcode.spring.domain.product.Product;
import my.study.testcode.spring.domain.product.ProductRepository;
import my.study.testcode.spring.domain.product.ProductSellingStatus;
import my.study.testcode.spring.domain.product.ProductType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import static my.study.testcode.spring.domain.order.OrderStatus.PAYMENT_COMPLETED;
import static my.study.testcode.spring.domain.order.OrderStatus.PAYMENT_FAILED;
import static my.study.testcode.spring.domain.product.ProductSellingStatus.SELLING;
import static my.study.testcode.spring.domain.product.ProductType.HANDMADE;
import static org.assertj.core.api.Assertions.assertThat;

@Transactional
class OrderRepositoryTest extends IntegrationTestSupport {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @DisplayName("결제 완료된 오늘 날짜의 각각의 주문목록들의 총 합계를 확인한다.")
    @Test
    void test() {
        // given
        Product product1 = createProduct("001", HANDMADE, SELLING, "아메리카노", 4000);
        Product product2 = createProduct("002", HANDMADE, SELLING, "아메리카노", 4000);
        productRepository.saveAll(List.of(product1, product2));

        List<Product> products = List.of(product1, product2);
        List<Product> products2 = List.of(product1);

        LocalDateTime now = LocalDateTime.of(2023,5,11,15,23,52);

        Order order1 = Order.create(products, now);
        order1.setOrderStatus(PAYMENT_COMPLETED);

        Order order2 = Order.create(products, now);
        order2.setOrderStatus(PAYMENT_FAILED);

        Order order3 = Order.create(products2, now);
        order3.setOrderStatus(PAYMENT_COMPLETED);

        orderRepository.saveAll(List.of(order1, order2, order3));

        LocalDateTime startDate = LocalDateTime.of(2023, 5, 11, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2023, 5, 12, 0, 0);

        // when
        List<Order> OrderWhenToday = orderRepository.findOrdersBy(
                startDate,
                endDate,
                PAYMENT_COMPLETED
        );

        // then
        assertThat(OrderWhenToday).hasSize(2)
                .extracting("totalPrice")
                .containsExactlyInAnyOrder(
                        8000, 4000
                );
    }

    private Product createProduct(String productNumber, ProductType type, ProductSellingStatus selling, String name, int price) {
        return Product.builder()
                .productNumber(productNumber)
                .type(type)
                .sellingStatus(selling)
                .name(name)
                .price(price)
                .build();
    }
}