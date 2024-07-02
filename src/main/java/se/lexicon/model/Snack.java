package se.lexicon.model;

public class Snack extends Product {
    private String flavor;

    // Constructor
    public Snack(String id, double price, String productName, String flavor) {
        super(id, price, productName);
        this.flavor = flavor;
    }

    // Getters
    public String getFlavor() {
        return flavor;
    }

    // Setters
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Abstract method
    @Override
    public String examine() {
        return "Snack [ID=" + getId() + ", Name=" + getProductName() + ", Price=" + getPrice() + ", Flavor=" + flavor + "]";
    }

    @Override
    public String use() {
        return "You are eating the " + getProductName() + " snack with " + flavor + " flavor.";
    }
}
