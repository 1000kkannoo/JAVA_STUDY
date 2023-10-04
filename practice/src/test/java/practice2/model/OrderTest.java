package practice2.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {
    @DisplayName("주문을 할 경우 주문내역과 메뉴의 수량이 감소한다.")
    @Test
    void saveOrder() {
        // given
        Menu menu = Menu.createMenu(1L, "음식1", 12000, "양식", 99);

        // when
        Order order = Order.saveOrder(1L, menu, 2);

        // then
        assertThat(order)
                .extracting("orderId", "sumPrice", "menu.quantity", "count")
                .contains(1L, 24000, 97, 2);
    }

    @DisplayName("상세 주문 조회")
    @Test
    void readDetailOrder() {
        // given
        Menu menu = Menu.createMenu(1L, "음식1", 12000, "양식", 99);
        Order order1 = Order.saveOrder(1L, menu, 2);
        Order order2 = Order.saveOrder(2L, menu, 2);
        Order order3 = Order.saveOrder(3L, menu, 3);
        Order order4 = Order.saveOrder(4L, menu, 2);
        Order order5 = Order.saveOrder(5L, menu, 2);
        List<Order> orders = List.of(order1, order2, order3, order4, order5);

        // when
        Order order = Order.readDetailOrder(orders, 3L);

        // then
        assertThat(order)
                .extracting("orderId", "sumPrice", "menu", "count")
                .contains(3L, 36000, menu, 3);
    }
}