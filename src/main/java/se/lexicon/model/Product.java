package se.lexicon.model;

public abstract class Product {
    private String id;
    private double price;
    private String productName;

    // Constructor
    public Product(String id, double price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    // Getters
    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Abstract method
    public abstract String examine();

    public abstract String use();
}
