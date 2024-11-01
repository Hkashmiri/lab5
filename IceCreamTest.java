package edu.dsu.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IceCreamTest {

    @Test
    public void testGetPrice() {
        IceCream iceCream = new IceCream("Vanilla", true, 4.99, true);
        assertEquals(4.99, iceCream.getPrice(), 0.01);
    }

    @Test
    public void testGetDescriptionWithToppings() {
        IceCream iceCream = new IceCream("Chocolate", true, 5.99, true);
        assertEquals("Chocolate ice cream with toppings", iceCream.getDescription());
    }

    @Test
    public void testGetDescriptionWithoutToppings() {
        IceCream iceCream = new IceCream("Strawberry", false, 4.49, true);
        assertEquals("Strawberry ice cream without toppings", iceCream.getDescription());
    }

    @Test
    public void testIsAvailable() {
        IceCream iceCream = new IceCream("Mint", true, 3.99, true);
        assertTrue(iceCream.isAvailable());
    }

    @Test
    public void testIsNotAvailable() {
        IceCream iceCream = new IceCream("Cookie Dough", false, 6.99, false);
        assertFalse(iceCream.isAvailable());
    }
}
