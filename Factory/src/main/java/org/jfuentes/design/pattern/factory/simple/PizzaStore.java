package org.jfuentes.design.pattern.factory.simple;

import org.jfuentes.design.pattern.factory.simple.pizza.Pizza;

/**
 * Created by jfuentes on 5/12/14.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
