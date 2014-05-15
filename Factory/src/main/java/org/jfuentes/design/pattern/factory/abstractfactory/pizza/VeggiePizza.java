package org.jfuentes.design.pattern.factory.abstractfactory.pizza;


import org.jfuentes.design.pattern.factory.abstractfactory.ingredientfamily.PizzaIngredientFactory;

/**
 * Created by jfuentes on 5/12/14.
 */
public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
