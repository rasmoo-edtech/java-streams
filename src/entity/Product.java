package entity;

import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{ name='" + name + "', price=" + price + " }";
    }

}
