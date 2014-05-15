package main.java.org.jfuentes.design.pattern.pattern.java.observer;

import java.util.Observable;

/**
 * Created by jfuentes on 4/9/14.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() { }

    public void measurementsChanged() {
        setChanged();
        notifyObservers(this);
    }

    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
