package main.java.org.jfuentes.design.pattern.pattern.strategy.duck;

import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.FlyNoWay;
import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.MuteQuack;

/**
 * Created by jfuentes on 4/10/14.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck (){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I'm a decoy duck.");
    }
}
