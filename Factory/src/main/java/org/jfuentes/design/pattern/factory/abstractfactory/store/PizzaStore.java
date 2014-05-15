package org.jfuentes.design.pattern.factory.abstractfactory.store;


import org.jfuentes.design.pattern.factory.abstractfactory.pizza.Pizza;

/**
 * Created by jfuentes on 5/12/14.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
