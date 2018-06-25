package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;
public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testAdditionalCheesePizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheesePizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        System.out.println(theCost);
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testAdditionalCheesePizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheesePizzaOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        System.out.println(description);
        assertEquals("Pizza with tomato sauce and cheese + additional cheese", description);
    }

    @Test
    public void testHawaiianChickenBreastPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HawaiianPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ChickenBreastPizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        System.out.println(theCost);
        assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public void testHawaiianChickenBreastPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HawaiianPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new ChickenBreastPizzaOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        System.out.println(description);
        assertEquals("Pizza with tomato sauce and cheese + ham & pineapple + chicken breast", description);
    }

    @Test
    public void testPepperoniWithSteakAndTunaPizzaWithAdditionalCheeseOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PepperoniPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new SteakPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new TunaPizzaOrdedDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheesePizzaOrderDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        System.out.println(theCost);
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testPepperoniWithSteakAndTunaPizzaWithAdditionalCheeseOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PepperoniPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new SteakPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new TunaPizzaOrdedDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheesePizzaOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        System.out.println(description);
        assertEquals("Pizza with tomato sauce and cheese + pepperoni + shaved steak + tuna + additional cheese",
                description);
    }
}
