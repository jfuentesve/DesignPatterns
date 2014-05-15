package main.java.org.jfuentes.design.pattern.pattern.strategy.duck;

import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.FlyWithWings;
import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.Quack;

/**
 * Created by jfuentes on 4/10/14.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Red Head duck!");
    }
}
