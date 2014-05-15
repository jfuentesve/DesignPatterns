package main.java.org.jfuentes.design.pattern.pattern.strategy.duck;

import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.FlyNoWay;
import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.Quack;

/**
 * Created by jfuentes on 4/10/14.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I' a model duck!");
    }
}
