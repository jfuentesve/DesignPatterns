package main.java.org.jfuentes.design.pattern.pattern.strategy.duck;

import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.Quack;
import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.QuackBehavior;

/**
 * Created by jfuentes on 4/10/14.
 */
public class CallDuck  {
   private QuackBehavior quackBehavior;

    public CallDuck(){
        quackBehavior = new Quack();
    }

    public void performCallDuckQuack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
