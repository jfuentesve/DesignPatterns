package main.java.org.jfuentes.design.pattern.pattern.observer.display;

import main.java.org.jfuentes.design.pattern.pattern.observer.observer.Observer;
import main.java.org.jfuentes.design.pattern.pattern.observer.observer.Subject;

/**
 * Created by jfuentes on 4/9/14.
 */
public class CurrentConditionsDisplay implements Observer , DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
