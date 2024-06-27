package entity;

import java.util.UUID;

public class OrderItem {

    private UUID id;
    private Product product;
    private int amount;

    public OrderItem(Product product, int amount) {
        this.id = UUID.randomUUID();
        this.product = product;
        this.amount = amount;
    }

    public Double getPrice() {
        return product.getPrice() * this.amount;
    }

    public UUID getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "{ product=" + product + ", amount=" + amount + " }";
    }

}
