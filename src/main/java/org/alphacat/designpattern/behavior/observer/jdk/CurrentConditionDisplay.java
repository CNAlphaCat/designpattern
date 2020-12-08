package org.alphacat.designpattern.behavior.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者，实现了观察者接口
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);//添加为可观察者中的观察者
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay [temperature=" + temperature
                + ", humidity=" + humidity + ", pressure=" + pressure + "]";
    }
}
