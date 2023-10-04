package practice2.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

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
}