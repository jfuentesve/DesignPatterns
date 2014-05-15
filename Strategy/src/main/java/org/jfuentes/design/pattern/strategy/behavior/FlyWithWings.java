package main.java.org.jfuentes.design.pattern.pattern.strategy.behavior;

/**
 * Created by jfuentes on 4/10/14.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying! With wings!");
    }
}
