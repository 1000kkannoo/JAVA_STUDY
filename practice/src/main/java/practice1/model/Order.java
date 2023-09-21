package practice1.model;

public class Order {
    private Long productId;
    private String productName;
    private Integer quantity;
    private Integer price;

    public Order(Long productId, String productName, Integer quantity, Integer price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void updateOrder(Integer quantity, Integer price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPrice() {
        return price;
    }
}
