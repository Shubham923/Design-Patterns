package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       int index = observers.indexOf(o);
       if(index>=0) {
           observers.remove(index);
       }
    }

    @Override
    public void notifyObserver() {
        for (int i=0; i<observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
