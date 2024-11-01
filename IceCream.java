package edu.dsu.app;

public class IceCream implements MenuItem {
    private String flavor;
    private boolean hasToppings;
    private double price;
    private boolean available;

    public IceCream(String flavor, boolean hasToppings, double price, boolean available) {
        this.flavor = flavor;
        this.hasToppings = hasToppings;
        this.price = price;
        this.available = available;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        String toppingsDescription = hasToppings ? "with toppings" : "without toppings";
        return flavor + " ice cream " + toppingsDescription;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}
