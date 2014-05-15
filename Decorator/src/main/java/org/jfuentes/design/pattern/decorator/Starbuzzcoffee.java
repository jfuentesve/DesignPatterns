package org.jfuentes.design.pattern.decorator;

import org.jfuentes.design.pattern.decorator.beverage.Beverage;
import org.jfuentes.design.pattern.decorator.beverage.DarkRoast;
import org.jfuentes.design.pattern.decorator.beverage.Espresso;
import org.jfuentes.design.pattern.decorator.beverage.HouseBlend;
import org.jfuentes.design.pattern.decorator.decorator.Mocha;
import org.jfuentes.design.pattern.decorator.decorator.Soy;
import org.jfuentes.design.pattern.decorator.decorator.Whip;

/**
 * Created by jfuentes on 4/20/14.
 */
public class Starbuzzcoffee {
    public static void main (String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());


    }
}
