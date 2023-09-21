package practice1.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {

    @DisplayName("주문을 수정한다.")
    @Test
    void updateOrder() {
        // given
        Order order = new Order(1L, "맨체스터시티 23-24 어웨이", 2, 298000);

        // when
        order.updateOrder(1, 149000);

        // then
        assertThat(order)
                .extracting("productId", "productName", "quantity", "price")
                .contains(1L, "맨체스터시티 23-24 어웨이", 1, 149000);
    }

}