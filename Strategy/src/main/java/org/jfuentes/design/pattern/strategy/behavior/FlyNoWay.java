package main.java.org.jfuentes.design.pattern.pattern.strategy.behavior;

/**
 * Created by jfuentes on 4/10/14.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
