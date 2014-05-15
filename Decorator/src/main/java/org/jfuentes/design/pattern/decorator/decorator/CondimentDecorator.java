package org.jfuentes.design.pattern.decorator.decorator;

import org.jfuentes.design.pattern.decorator.beverage.Beverage;

/**
 * Created by jfuentes on 4/20/14.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
