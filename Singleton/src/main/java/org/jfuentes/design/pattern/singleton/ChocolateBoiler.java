package org.jfuentes.design.pattern.singleton;

/**
 * Created by jfuentes on 5/16/14.
 */
public class ChocolateBoiler {

    private volatile static ChocolateBoiler chocolateBoiler = null;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if(chocolateBoiler == null){
            synchronized (ChocolateBoiler.class){
                if(chocolateBoiler == null ) {
                    chocolateBoiler = new ChocolateBoiler();
                }
        }   }
        return chocolateBoiler;
    }

    public void fill() {
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("Fill the boiler with a milk/chocolate mixture.");
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            System.out.println("Drain the boiled milk and chocolate.");
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()){
            System.out.println("Bring the contents to boil.");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
