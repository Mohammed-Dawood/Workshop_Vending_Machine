package se.lexicon.model;

public class Toy extends Product {
    private int ageRecommendation;

    // Constructor
    public Toy(String id, double price, String productName, int ageRecommendation) {
        super(id, price, productName);
        this.ageRecommendation = ageRecommendation;
    }

    // Getters
    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    // Setters
    public void setAgeRecommendation(int ageRecommendation) {
        this.ageRecommendation = ageRecommendation;
    }

    // Abstract method
    @Override
    public String examine() {
        return "Toy [ID=" + getId() + ", Name=" + getProductName() + ", Price=" + getPrice() + ", Recommended Age=" + ageRecommendation + " years]";
    }

    @Override
    public String use() {
        return "You are playing with the " + getProductName() + " toy, suitable for ages " + ageRecommendation + " and up.";
    }

    @Override
    public double calculateTax() {
        return super.getPrice() * 0.3;
    }
}
