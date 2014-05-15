package org.jfuentes.design.pattern.decorator.decorator;

import org.jfuentes.design.pattern.decorator.beverage.Beverage;

/**
 * Created by jfuentes on 4/20/14.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
