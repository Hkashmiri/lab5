package edu.dsu.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CakeTest {

    @Test
    public void testGetPrice() {
        Cake cake = new Cake("Chocolate", 3, 15.99, true);
        assertEquals(15.99, cake.getPrice(), 0.01);
    }

    @Test
    public void testGetDescription() {
        Cake cake = new Cake("Vanilla", 2, 12.99, true);
        assertEquals("Vanilla cake with 2 layers", cake.getDescription());
    }

    @Test
    public void testGetDescriptionWithMoreLayers() {
        Cake cake = new Cake("Strawberry", 4, 18.99, true);
        assertEquals("Strawberry cake with 4 layers", cake.getDescription());
    }

    @Test
    public void testIsAvailable() {
        Cake cake = new Cake("Red Velvet", 3, 14.99, true);
        assertTrue(cake.isAvailable());
    }

    @Test
    public void testIsNotAvailable() {
        Cake cake = new Cake("Carrot", 2, 11.99, false);
        assertFalse(cake.isAvailable());
    }
}
