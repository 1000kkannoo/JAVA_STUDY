package practice1.model;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void deleteOrder(Long productId) {
        Order findOrder = findOrderByProductId(productId);
        orders.remove(findOrder);
    }

    public Integer readAllOrderPrice() {
        return orders.stream()
                .mapToInt(Order::getPrice)
                .sum();
    }

    private Order findOrderByProductId(Long productId) {
        return orders.stream()
                .filter(order -> order.getProductId().equals(productId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 Order는 존재하지 않습니다."));
    }

    public List<Order> getOrders() {
        return orders;
    }
}
