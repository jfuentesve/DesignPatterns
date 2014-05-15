package org.jfuentes.design.pattern.factory.abstractfactory.store;


import org.jfuentes.design.pattern.factory.abstractfactory.ingredientfamily.ChicagoPizzaIngredientFactory;
import org.jfuentes.design.pattern.factory.abstractfactory.ingredientfamily.PizzaIngredientFactory;
import org.jfuentes.design.pattern.factory.abstractfactory.pizza.*;

/**
 * Created by jfuentes on 5/12/14.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggies Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
