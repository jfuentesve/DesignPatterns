package org.jfuentes.design.pattern.factory.abstractfactory.ingredientfamily;

/**
 * Created by jfuentes on 5/14/14.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Spinach(), new BlackOlives(), new EggPlant()};
        return  veggies;
    }
}
