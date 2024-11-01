package edu.dsu.app;

public class Cake implements MenuItem {
    private String flavor;
    private int numberOfLayers;
    private double price;
    private boolean available;

    public Cake(String flavor, int numberOfLayers, double price, boolean available) {
        this.flavor = flavor;
        this.numberOfLayers = numberOfLayers;
        this.price = price;
        this.available = available;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return flavor + " cake with " + numberOfLayers + " layers";
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}
