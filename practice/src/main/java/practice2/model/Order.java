package practice2.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Long orderId;
    private LocalDateTime createAt;
    private Integer sumPrice;
    private List<Menu> menu;

    public Long getOrderId() {
        return orderId;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public Integer getSumPrice() {
        return sumPrice;
    }

    public List<Menu> getMenu() {
        return menu;
    }
}
