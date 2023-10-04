package practice2.model;

import java.util.List;

public class Menu {
    private Long menuId;
    private String name;
    private Integer price;
    private String category;
    private Integer quantity;

    private Menu(Long menuId, String name, Integer price, String category, Integer quantity) {
        this.menuId = menuId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public static Menu createMenu(Long menuId, String name, Integer price, String category, Integer quantity) {
        return new Menu(menuId, name, price, category, quantity);
    }

    public static Menu readDetailMenu(List<Menu> menus, Long menuId) {
        for (Menu menu : menus) {
            if (menu.getMenuId().equals(menuId)) {
                return menu;
            }
        }
        throw new IllegalArgumentException("해당 메뉴를 찾을 수 없습니다.");
    }

    public void minusQuantity(int minus) {
        this.quantity -= minus;
    }

    public Long getMenuId() {
        return menuId;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
