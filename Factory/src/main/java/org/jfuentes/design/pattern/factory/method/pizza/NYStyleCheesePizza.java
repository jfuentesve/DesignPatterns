package org.jfuentes.design.pattern.factory.method.pizza;

/**
 * Created by jfuentes on 5/12/14.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano cheese");
    }
}
