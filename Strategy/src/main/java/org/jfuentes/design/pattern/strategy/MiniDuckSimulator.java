package main.java.org.jfuentes.design.pattern.pattern.strategy;

import main.java.org.jfuentes.design.pattern.pattern.strategy.behavior.FlyRocketPowered;
import main.java.org.jfuentes.design.pattern.pattern.strategy.duck.*;

/**
 * Created by jfuentes on 4/10/14.
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("\n\n\n");

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println("\n\n\n");

        Duck rubbie = new RubberDuck();
        rubbie.display();
        rubbie.performQuack();
        rubbie.performFly();
        rubbie.swim();

        System.out.println("\n\n\n");

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();
        System.out.println("\n\n\n");

        Duck redHead = new RedHeadDuck();
        redHead.display();
        redHead.performQuack();
        redHead.performFly();

        System.out.println("\n\n\n");
        System.out.println("Hunter: hehe, Imma find these ducks...");
        CallDuck callDuck = new CallDuck();
        callDuck.performCallDuckQuack();


    }
}
