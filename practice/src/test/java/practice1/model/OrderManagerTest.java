package practice1.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    @DisplayName("주문목록에 새로운 주문을 추가한다.")
    @Test
    void addOrder() {
        // given
        OrderManager orderManager = new OrderManager();
        Order order1 = new Order(1L, "이펙티브자바", 1, 34000);
        Order order2 = new Order(5L, "do it! 자바편", 1, 28000);

        // when
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

    @DisplayName("주문 목록 중 하나의 Order를 삭제한다.")
    @Test
    void deleteOrder() {
        // given
        OrderManager orderManager = new OrderManager();
        Order order1 = new Order(1L, "이펙티브자바", 1, 34000);
        Order order2 = new Order(5L, "do it! 자바편", 1, 28000);
        Order order3 = new Order(13L, "do it! 파이썬편", 1, 24000);

        orderManager.addOrder(order1);
        orderManager.addOrder(order2);
        orderManager.addOrder(order3);

        // when
        orderManager.deleteOrder(5L);

        // then
        assertThat(orderManager.getOrders())
                .hasSize(2)
                .extracting("productId", "productName", "quantity", "price")
                .contains(
                        tuple(1L, "이펙티브자바", 1, 34000),
                        tuple(13L, "do it! 파이썬편", 1, 24000)
                );
    }

    @DisplayName("주문 목록 중 하나의 Order를 삭제할때 존재하지 않는 productId를 입력시 에러가 발생한다.")
    @Test
    void deleteOrderThrowNotFoundException() {
        // given
        OrderManager orderManager = new OrderManager();
        Order order1 = new Order(1L, "이펙티브자바", 1, 34000);
        orderManager.addOrder(order1);

        // when // then
        assertThatThrownBy(() -> orderManager.deleteOrder(2L))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("해당 Order는 존재하지 않습니다.");

    }

    @DisplayName("주문 목록의 총 금액을 구한다.")
    @Test
    void readAllOrderPrice() {
        // given
        OrderManager orderManager = new OrderManager();
        Order order1 = new Order(1L, "이펙티브자바1", 1, 34000);
        Order order2 = new Order(5L, "이펙티브자바2", 1, 32000);
        Order order3 = new Order(15L, "이펙티브자바3", 1, 33000);

        orderManager.addOrder(order1);
        orderManager.addOrder(order2);
        orderManager.addOrder(order3);

        // when
        Integer sumPrice = orderManager.readAllOrderPrice();

        // then
        assertThat(sumPrice).isEqualTo(99000);
    }
}