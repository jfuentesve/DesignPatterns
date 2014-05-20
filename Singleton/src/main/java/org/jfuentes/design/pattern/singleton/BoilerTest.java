package org.jfuentes.design.pattern.singleton;

/**
 * Created by jfuentes on 5/20/14.
 */
public class BoilerTest {
    public static void main (String [] args){
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();

        boiler.drain();
        boiler.boil();
        boiler.fill();
        boiler.drain();
        boiler.boil();
        boiler.drain();
        boiler.boil();

    }
}
