package edu.dsu.app;

public class Pizza implements MenuItem {
    private String size;
    private String toppings;
    private double price;
    private boolean available;

    public Pizza(String size, String toppings, double price, boolean available) {
        this.size = size;
        this.toppings = toppings;
        this.price = price;
        this.available = available;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return size + " pizza with " + toppings;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    // Additional methods

    // Method to update the availability of the pizza
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to apply a discount to the pizza price
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            price -= (price * (discountPercentage / 100));
        }
    }

    // Method to change the toppings
    public void changeToppings(String newToppings) {
        this.toppings = newToppings;
    }

    // Method to update the pizza size
    public void updateSize(String newSize) {
        this.size = newSize;
    }
}
