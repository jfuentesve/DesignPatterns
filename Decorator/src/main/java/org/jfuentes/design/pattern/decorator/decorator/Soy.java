package org.jfuentes.design.pattern.decorator.decorator;

import org.jfuentes.design.pattern.decorator.beverage.Beverage;

/**
 * Created by jfuentes on 4/20/14.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
