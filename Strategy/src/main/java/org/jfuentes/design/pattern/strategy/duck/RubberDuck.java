package main.java.org.jfuentes.design.pattern.pattern.strategy.duck;

import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.FlyNoWay;
import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.Squeak;

/**
 * Created by jfuentes on 4/10/14.
 */
public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I'm a rubbie duck.");
    }
}
