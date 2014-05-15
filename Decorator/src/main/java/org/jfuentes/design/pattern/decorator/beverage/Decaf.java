package org.jfuentes.design.pattern.decorator.beverage;

/**
 * Created by jfuentes on 4/20/14.
 */
public class Decaf extends Beverage{
    public Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
