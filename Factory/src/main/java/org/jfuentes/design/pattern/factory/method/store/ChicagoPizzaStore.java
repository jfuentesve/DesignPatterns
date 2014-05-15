package org.jfuentes.design.pattern.factory.method.store;


import org.jfuentes.design.pattern.factory.method.pizza.*;

/**
 * Created by jfuentes on 5/12/14.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
