package entity;

import java.util.List;
import java.util.UUID;

public class Order {

    private UUID id;
    private Client client;
    private List<OrderItem> items;

    private Double price;

    public Order(Client client, List<OrderItem> items) {
        this.id = UUID.randomUUID();
        this.client = client;
        this.items = items;

        this.calculatePrice();
    }

    private void calculatePrice() {
        this.price = this.items.stream()
                .map(OrderItem::getPrice)
                .reduce(0d, Double::sum);
    }

    public UUID getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "{ client=" + client + ", price=" + String.format("%.2f", getPrice()) + ", items=" + items + " }";
    }

}
