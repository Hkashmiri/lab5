package edu.dsu.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MenuTest {

    private Menu menu;

    @BeforeEach
    public void setUp() {
        menu = new Menu();
    }

    @Test
    public void testAddItem() {
        MenuItem pizza = new Pizza("Large", "Pepperoni", 12.99, true);
        menu.addItem(pizza);
        assertEquals(1, menu.getAvailableItems().size());
    }

    @Test
    public void testRemoveItem() {
        MenuItem burger = new Burger("Beef", true, 9.99, true);
        menu.addItem(burger);
        menu.removeItem(burger);
        assertEquals(0, menu.getAvailableItems().size());
    }

    @Test
    public void testGetAvailableItems() {
        MenuItem pizza = new Pizza("Medium", "Mushrooms", 10.99, true);
        MenuItem salad = new Salad("Caesar", true, 5.99, false);

        menu.addItem(pizza);
        menu.addItem(salad);

        List<MenuItem> availableItems = menu.getAvailableItems();
        assertEquals(1, availableItems.size()); // Only one available item
        assertTrue(availableItems.contains(pizza));
        assertFalse(availableItems.contains(salad));
    }

    @Test
    public void testFindItemByDescription() {
        MenuItem burger = new Burger("Chicken", false, 8.99, true);
        MenuItem salad = new Salad("Ranch", true, 6.99, true);

        menu.addItem(burger);
        menu.addItem(salad);

        MenuItem foundItem = menu.findItemByDescription("Chicken burger no cheese");
        assertNotNull(foundItem);
        assertEquals("Chicken burger no cheese", foundItem.getDescription());

        MenuItem notFoundItem = menu.findItemByDescription("Non-existent item");
        assertNull(notFoundItem);
    }
}
