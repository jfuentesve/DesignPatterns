package org.jfuentes.design.pattern.decorator.beverage;

/**
 * Created by jfuentes on 4/20/14.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
