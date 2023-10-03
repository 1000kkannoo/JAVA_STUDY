package practice2.model;

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
