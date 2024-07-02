package se.lexicon.model;

public class Drink extends Product {
    private double volume;

    // Constructor
    public Drink(String id, double price, String productName, double volume) {
        super(id, price, productName);
        this.volume = volume;
    }

    // Getters
    public double getVolume() {
        return volume;
    }

    // Setters
    public void setVolume(double volume) {
        this.volume = volume;
    }

    // Abstract method
    @Override
    public String examine() {
        return "Drink [ID=" + getId() + ", Name=" + getProductName() + ", Price=" + getPrice() + ", Volume=" + volume + " liters]";
    }

    @Override
    public String use() {
        return "You are drinking " + getProductName() + " with a volume of " + volume + " liters.";
    }

    @Override
    public double calculateTax() {
        return super.getPrice() * 0.1;
    }
}
