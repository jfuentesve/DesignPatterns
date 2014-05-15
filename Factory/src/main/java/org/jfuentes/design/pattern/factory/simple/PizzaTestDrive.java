package org.jfuentes.design.pattern.factory.simple;


import org.jfuentes.design.pattern.factory.simple.pizza.Pizza;

/**
 * Created by jfuentes on 5/12/14.
 */
public class PizzaTestDrive {
    public static void main (String[] args){
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ethan ordered a: " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("Joel ordered a: " + pizza.getName() + "\n");

    }
}
