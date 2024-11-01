package edu.dsu.app;

public class Salad implements MenuItem {
    private String dressing;
    private boolean isVegetarian;
    private double price;
    private boolean available;

    public Salad(String dressing, boolean isVegetarian, double price, boolean available) {
        this.dressing = dressing;
        this.isVegetarian = isVegetarian;
        this.price = price;
        this.available = available;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        String vegetarian = isVegetarian ? "Vegetarian" : "Non-Vegetarian";
        return vegetarian + " salad with " + dressing + " dressing";
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    // Additional methods can be added here
}