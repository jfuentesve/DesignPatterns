package main.java.org.jfuentes.design.pattern.pattern.strategy.duck;

import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.FlyWithWings;
import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.Quack;

/**
 * Created by jfuentes on 4/10/14.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
