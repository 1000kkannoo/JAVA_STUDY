package practice2.model;

import java.util.List;

public class User {
    private Long userId;
    private String name;
    private List<Menu> menus;
    private List<Order> orders;

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
