package main.java.org.jfuentes.design.pattern.pattern.observer;

import main.java.org.jfuentes.design.pattern.pattern.observer.observer.Observer;
import main.java.org.jfuentes.design.pattern.pattern.observer.observer.Subject;

import java.util.ArrayList;

/**
 * Created by jfuentes on 4/9/14.
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
         for(Object observer: observers){
             ((Observer) observer).update(temperature,humidity,pressure);
         }
    }


    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
