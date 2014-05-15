package org.jfuentes.design.pattern.factory.simple;

import org.jfuentes.design.pattern.factory.simple.pizza.*;

/**
 * Created by jfuentes on 5/12/14.
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
