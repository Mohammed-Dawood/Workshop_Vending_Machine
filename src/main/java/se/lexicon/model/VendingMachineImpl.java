package se.lexicon.model;

import java.util.List;
import java.util.ArrayList;

public class VendingMachineImpl implements VendingMachine {
    private int balance;
    private final List<Product> products;

    // Constructor
    public VendingMachineImpl() {
        this.balance = 0;
        this.products = new ArrayList<>();
        // Example products for testing purposes
        products.add(new Snack("1", 10.0, "Chips", "Sour Cream"));
        products.add(new Drink("2", 15.0, "Cola", 0.5));
        products.add(new Toy("3", 25.0, "Action Figure", 7));
        products.add(new Snack("4", 12.0, "Chocolate Bar", "Milk Chocolate"));
        products.add(new Drink("5", 18.0, "Orange Juice", 0.3));
        products.add(new Toy("6", 30.0, "Teddy Bear", 15));
        products.add(new Snack("7", 8.0, "Cookies", "Chocolate Chip"));
        products.add(new Drink("8", 20.0, "Mineral Water", 0.75));
        products.add(new Toy("9", 50.0, "Puzzle", 500));
        products.add(new Snack("10", 5.0, "Candy", "Mixed Fruit"));
        products.add(new Drink("11", 25.0, "Energy Drink", 0.25));
        products.add(new Toy("12", 60.0, "Lego Set", 100));
    }

    // Abstract method
    @Override
    public void addCurrency(int amount) {
        int[] validAmounts = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        boolean isValid = false;
        for (int validAmount : validAmounts) {
            if (amount == validAmount) {
                isValid = true;
                break;
            }
        }
        if (isValid) {
            this.balance += amount;
        } else {
            System.out.println("Invalid amount. Please add a valid currency value.");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (Integer.parseInt(product.getId()) == id) {
                if (balance >= product.getPrice()) {
                    balance -= (int) product.getPrice();
                    return product;
                } else {
                    System.out.println("Insufficient balance.");
                    return null;
                }
            }
        }
        System.out.println("Product not found.");
        return null;
    }

    @Override
    public int endSession() {
        int refund = balance;
        balance = 0;
        return refund;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (Integer.parseInt(product.getId()) == id) {
                return product.examine();
            }
        }
        return "Product not found.";
    }

    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            productDescriptions[i] = "ID: " + product.getId() + ", Name: " + product.getProductName() + ", Price: " + product.getPrice();
        }
        return productDescriptions;
    }
}
