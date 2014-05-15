package org.jfuentes.design.pattern.decorator.decorator;

import org.jfuentes.design.pattern.decorator.beverage.Beverage;

/**
 * Created by jfuentes on 4/20/14.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
