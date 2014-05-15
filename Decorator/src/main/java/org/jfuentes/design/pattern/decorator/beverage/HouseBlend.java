package org.jfuentes.design.pattern.decorator.beverage;

/**
 * Created by jfuentes on 4/20/14.
 */
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
