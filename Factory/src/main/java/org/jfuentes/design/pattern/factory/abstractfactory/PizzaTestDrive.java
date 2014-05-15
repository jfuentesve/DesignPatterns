package org.jfuentes.design.pattern.factory.abstractfactory;


import org.jfuentes.design.pattern.factory.abstractfactory.pizza.Pizza;
import org.jfuentes.design.pattern.factory.abstractfactory.store.ChicagoPizzaStore;
import org.jfuentes.design.pattern.factory.abstractfactory.store.NYPizzaStore;
import org.jfuentes.design.pattern.factory.abstractfactory.store.PizzaStore;

/**
 * Created by jfuentes on 5/12/14.
 */
public class PizzaTestDrive {
    public static void main (String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
