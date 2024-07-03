package se.lexicon.model;

public interface VendingMachine {

    void addCurrency(int amount);

    double getBalance();

    Product request(int id);

    double endSession();

    String getDescription(int id);

    String[] getProducts();
}
