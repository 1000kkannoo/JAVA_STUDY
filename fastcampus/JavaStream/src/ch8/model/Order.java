package ch8.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private long id;
    private LocalDateTime createdAt;
    private long createdByUserId;
    private OrderStatus status;
    // 큰 수를 표현하기위해 BigDecimal로 선언
    private BigDecimal amount;
    private List<OrderLine> orderLines;

    public long getId() {
        return id;
    }

    public Order setId(long id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Order setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public long getCreatedByUserId() {
        return createdByUserId;
    }

    public Order setCreatedByUserId(long createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Order setStatus(OrderStatus status) {
        this.status = status;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Order setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public Order setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", createdByUserId=" + createdByUserId +
                ", status=" + status +
                ", amount=" + amount +
                ", orederLines=" + orderLines +
                '}' + '\n';
    }

    public enum OrderStatus {
        CREATED,
        IN_PROGRESS,
        ERROR,
        PROCESSED
    }
}
