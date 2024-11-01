package edu.dsu.app;

public class Burger implements MenuItem {
    private String pattyType;
    private boolean hasCheese;
    private double price;
    private boolean available;

    public Burger(String pattyType, boolean hasCheese, double price, boolean available) {
        this.pattyType = pattyType;
        this.hasCheese = hasCheese;
        this.price = price;
        this.available = available;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        String cheese = hasCheese ? "with cheese" : "no cheese";
        return pattyType + " burger " + cheese;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    // Additional methods can be added here
}