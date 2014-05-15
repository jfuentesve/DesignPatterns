package org.jfuentes.design.pattern.factory.simple.pizza;

/**
 * Created by jfuentes on 5/12/14.
 */
public abstract class Pizza {
    String name;
    public void prepare(){}
    public void bake(){}
    public void cut(){}
    public void box(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
