package org.jfuentes.design.pattern.factory.abstractfactory.ingredientfamily;

/**
 * Created by jfuentes on 5/14/14.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clam createClam();
    public Pepperoni createPepperoni();
    public Veggies[] createVeggies();
}
