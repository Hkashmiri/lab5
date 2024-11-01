package edu.dsu.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaTest {

    @Test
    public void testGetPrice() {
        Pizza pizza = new Pizza("Large", "Pepperoni", 12.99, true);
        assertEquals(12.99, pizza.getPrice());
    }

    @Test
    public void testGetDescription() {
        Pizza pizza = new Pizza("Medium", "Mushrooms and Onions", 10.99, true);
        assertEquals("Medium pizza with Mushrooms and Onions", pizza.getDescription());
    }

    @Test
    public void testIsAvailable() {
        Pizza pizza = new Pizza("Small", "Cheese", 8.99, false);
        assertFalse(pizza.isAvailable());
    }
}