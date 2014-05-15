package main.java.org.jfuentes.design.pattern.pattern.strategy.behavior;

/**
 * Created by jfuentes on 4/10/14.
 */
public class Squeak implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeeeeak e!");
    }
}
