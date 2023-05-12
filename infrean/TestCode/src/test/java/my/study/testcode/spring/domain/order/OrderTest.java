package my.study.testcode.spring.domain.order;

import my.study.testcode.spring.domain.product.Product;
import my.study.testcode.spring.domain.product.ProductType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static my.study.testcode.spring.domain.product.ProductSellingStatus.SELLING;
import static org.assertj.core.api.Assertions.assertThat;


class OrderTest {

    @DisplayName("주문 생성 시 상품 리스트에서 주문의 총 금액을 계산한다.")
    @Test
    void calculateTotalPrice() {
        // given
        LocalDateTime registeredDateTime = LocalDateTime.now();
        List<Product> products = List.of(
                createProduct("001", 1000),
                createProduct("002", 3000)
        );

        // when
        Order order = Order.create(products, registeredDateTime);

        // then
        assertThat(order.getTotalPrice()).isEqualTo(4000);
    }

    @DisplayName("주문 생성 시 주문 상태는 INIT 이다.")
    @Test
    void init() {
        // given
        List<Product> products = List.of(
                createProduct(),
                createProduct()
        );

        // when
        Order order = Order.create(products, LocalDateTime.now());

        // then
        assertThat(order.getOrderStatus()).isEqualByComparingTo(OrderStatus.INIT);
    }

    @DisplayName("주문 생성 시 주문 등록 시간을 기록한다.")
    @Test
    void registeredDateTime() {
        // given
        LocalDateTime registeredDateTime = LocalDateTime.now();
        List<Product> products = List.of(
                createProduct(),
                createProduct()
        );

        // when
        Order order = Order.create(products, registeredDateTime);

        // then
        assertThat(order.getRegisteredDateTime()).isEqualTo(registeredDateTime);
    }

    private Product createProduct(String productNumber, int price) {
        return Product.builder()
                .type(ProductType.HANDMADE)
                .productNumber(productNumber)
                .price(price)
                .sellingStatus(SELLING)
                .name("메뉴 이름")
                .build();
    }

    private Product createProduct() {
        return Product.builder()
                .type(ProductType.HANDMADE)
                .productNumber("productNumber")
                .price(2000)
                .sellingStatus(SELLING)
                .name("메뉴 이름")
                .build();
    }
}