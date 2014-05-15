package org.jfuentes.design.pattern.decorator.beverage;

/**
 * Created by jfuentes on 4/20/14.
 */
public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
