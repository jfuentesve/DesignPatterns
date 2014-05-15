package org.jfuentes.design.pattern.factory.abstractfactory.store;


import org.jfuentes.design.pattern.factory.abstractfactory.ingredientfamily.NYPizzaIngredientFactory;
import org.jfuentes.design.pattern.factory.abstractfactory.ingredientfamily.PizzaIngredientFactory;
import org.jfuentes.design.pattern.factory.abstractfactory.pizza.*;

/**
 * Created by jfuentes on 5/12/14.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggies Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
