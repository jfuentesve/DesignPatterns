package main.java.org.jfuentes.design.pattern.pattern.observer.observer;

/**
 * Created by jfuentes on 4/4/14.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
}
