package practice1.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    @DisplayName("주문목록에 새로운 주문을 추가한다.")
    @Test
    void addOrder() {
        // given
        OrderManager orderManager = new OrderManager();

        // when
        Order order1 = new Order(1L, "이펙티브자바", 1, 34000);
        Order order2 = new Order(5L, "do it! 자바편", 1, 28000);
        orderManager.addOrder(order1);
        orderManager.addOrder(order2);

        // then
        assertThat(orderManager.getOrders())
                .hasSize(2)
                .extracting("productId", "productName", "quantity", "price")
                .contains(
                        tuple(1L, "이펙티브자바", 1, 34000),
                        tuple(5L, "do it! 자바편", 1, 28000)
                );
    }

}