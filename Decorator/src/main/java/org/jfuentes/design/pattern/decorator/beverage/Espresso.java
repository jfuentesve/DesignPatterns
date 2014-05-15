package org.jfuentes.design.pattern.decorator.beverage;

/**
 * Created by jfuentes on 4/20/14.
 */
public class Espresso extends Beverage{
    public Espresso (){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
