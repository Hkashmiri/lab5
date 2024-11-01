package edu.dsu.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BurgerTest {

    @Test
    public void testGetPrice() {
        Burger burger = new Burger("Beef", true, 9.99, true);
        assertEquals(9.99, burger.getPrice());
    }

    @Test
    public void testGetDescription() {
        Burger burger = new Burger("Chicken", false, 8.99, true);
        assertEquals("Chicken burger no cheese", burger.getDescription());
    }

    @Test
    public void testIsAvailable() {
        Burger burger = new Burger("Veggie", true, 7.99, false);
        assertFalse(burger.isAvailable());
    }
}