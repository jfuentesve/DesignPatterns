package main.java.org.jfuentes.design.pattern.pattern.java.observer;

import main.java.org.jfuentes.design.pattern.pattern.java.observer.display.CurrentConditionsDisplay;

/**
 * Created by jfuentes on 4/4/14.
 */
public class WeatherStation {

    public static void main (String[] args){
        WeatherData weatherData = new WeatherData();


        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
