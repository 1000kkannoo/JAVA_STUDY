package practice2.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Long orderId;
    private LocalDateTime createAt;
    private Integer sumPrice;
    private Menu menu;
    private Integer count;

    private Order(Long orderId, Integer sumPrice, Menu menu, Integer count) {
        this.orderId = orderId;
        this.createAt = LocalDateTime.now();
        this.sumPrice = sumPrice;
        this.menu = menu;
        this.count = count;
    }

    public static Order readDetailOrder(List<Order> orders, Long orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        throw new IllegalArgumentException("존재하지 않는 order 입니다.");
    }

    public static Order saveOrder(Long orderId, Menu menu, Integer count) {
        menu.minusQuantity(count);
        return new Order(orderId, menu.getPrice() * count, menu, count);
    }

    public Long getOrderId() {
        return orderId;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public Integer getSumPrice() {
        return sumPrice;
    }

    public Menu getMenu() {
        return menu;
    }

    public Integer getCount() {
        return count;
    }
}
