package edu.dsu.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SaladTest {

    @Test
    public void testGetPrice() {
        Salad salad = new Salad("Ranch", true, 6.99, true);
        assertEquals(6.99, salad.getPrice());
    }

    @Test
    public void testGetDescription() {
        Salad salad = new Salad("Italian", false, 7.99, true);
        assertEquals("Non-Vegetarian salad with Italian dressing", salad.getDescription());
    }

    @Test
    public void testIsAvailable() {
        Salad salad = new Salad("Caesar", true, 5.99, false);
        assertFalse(salad.isAvailable());
    }
}