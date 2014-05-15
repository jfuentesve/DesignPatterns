package main.java.org.jfuentes.design.pattern.pattern.java.observer.display;

import main.java.org.jfuentes.design.pattern.pattern.java.observer.WeatherData;

import java.util.Observer;
import java.util.Observable;

/**
 * Created by jfuentes on 4/9/14.
 */
public class CurrentConditionsDisplay implements Observer , DisplayElement {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof WeatherData){
            WeatherData weatherData = (WeatherData)arg;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
