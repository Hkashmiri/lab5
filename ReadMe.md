# Walkthrough: Implementing a Food Delivery App Interface in Java with JUnit5 and Maven

In this walkthrough, you’ll implement a simple food delivery app using Java. You’ll define an interface MenuItem and create classes like Pizza, Burger, and Salad that implement this interface. You’ll also write unit tests using JUnit5 to ensure your code works as expected. We’ll use Maven for project management and IntelliJ IDEA as the development environment.


## Understanding the Project Structure

The Maven project follows a standard directory layout:

```
food-delivery-starter
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── edu
    │           └── dsu
    │               └── app
    └── test
        └── java
            └── edu
                └── dsu
                    └── app
```

*	pom.xml: Maven configuration file where project dependencies are defined.
*	src/main/java: Contains the application source code.
*	src/test/java: Contains the unit tests.

Implementing the MenuItem Interface

1.	Finish the Interface: In `src/main/java/edu/dsu/app/`, create a new Java interface named `MenuItem.java.`
2.	Define the Interface Methods:

```
package edu.dsu.app;

public interface MenuItem {
    double getPrice();
    String getDescription();
    boolean isAvailable();
}
```

*	getPrice(): Returns the price of the menu item.
*	getDescription(): Returns a description of the menu item.
*	isAvailable(): Indicates if the item is available for order.

## Creating Classes that Implement MenuItem

1. Implementing the Pizza Class

    1.	Create the Class: In the same package, create a new Java class named Pizza.java.
    2.	Implement the MenuItem Interface:

```
package edu.dsu.app;

public class Pizza implements MenuItem {
    private String size;
    private String toppings;
    private double price;
    private boolean available;

    public Pizza(String size, String toppings, double price, boolean available) {
        this.size = size;
        this.toppings = toppings;
        this.price = price;
        this.available = available;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return size + " pizza with " + toppings;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    // Additional methods can be added here
}
```


2. Implementing the Burger Class

1.	Create the Class:
      * Create a new Java class named Burger.java.
2.	Implement the MenuItem Interface:

```
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
```


3. Implementing the Salad Class

    1.	Create the Class:
          •	Create a new Java class named Salad.java.
    2.	Implement the MenuItem Interface:

```
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
```


## Writing Unit Tests with JUnit5

1. Creating Test Classes

For each class, create a corresponding test class in src/test/java/com/example/app/.

a. Testing the Pizza Class

	1.	Create the Test Class:
	•	Create PizzaTest.java in src/test/java/edu/dsu/app/.
	2.	Write Test Methods:

```
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
```


b. Testing the Burger Class

	1.	Create the Test Class:
	•	Create BurgerTest.java.
	2.	Write Test Methods:

```
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
```


c. Testing the Salad Class

	1.	Create the Test Class:
	•	Create SaladTest.java.
	2.	Write Test Methods:

```
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
```


## Extending the Application

To deepen your understanding and make the application more robust, consider implementing the following extensions:

1. Implement a Menu Class
    * Purpose: Manage a collection of MenuItem objects.
    * Methods:
        * addItem(MenuItem item): Adds an item to the menu.
        * removeItem(MenuItem item): Removes an item from the menu.
        * getAvailableItems(): Returns a list of available items.
        * findItemByDescription(String description): Searches for an item.

### Implementation:

```
package edu.dsu.app;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public List<MenuItem> getAvailableItems() {
        List<MenuItem> availableItems = new ArrayList<>();
        for (MenuItem item : items) {
            if (item.isAvailable()) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

    public MenuItem findItemByDescription(String description) {
        for (MenuItem item : items) {
            if (item.getDescription().equalsIgnoreCase(description)) {
                return item;
            }
        }
        return null;
    }
}
```

## Homework Assignment: Extending the Food Delivery App

### Objective

Enhance your Food Delivery App by adding additional menu items and ensuring code quality through comprehensive unit tests using JUnit5.

**Assignment Details**

You will:

1.	Implement New Menu Items: Create at least two new classes that implement the MenuItem interface.
2.	Write Unit Tests: Develop unit tests for the new classes to verify their functionality.
3.	Update the Menu Class (Optional): If you’ve implemented a Menu class, incorporate your new items into it.
4.	Document Your Work: Provide a brief report detailing your additions and any challenges faced.

**Instructions**

1. Implement New Menu Items

    *	Choose at least two new menu items to add to the app. Examples include:
    *	Dessert (e.g., Cake, IceCream)
    *	Drink (e.g., Soda, Coffee)
    *	Appetizer (e.g., Fries, Nachos)
    *	ComboMeal (a combination of items)
    *	Create new classes in `src/main/java/edu/dsu/app/` that implement the `MenuItem` interface.
    *	Define unique properties and behaviors relevant to each new menu item.
    * Ensure adherence to the MenuItem interface by implementing all its methods.