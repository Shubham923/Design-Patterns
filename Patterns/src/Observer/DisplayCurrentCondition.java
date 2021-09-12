package Observer;

public class DisplayCurrentCondition implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;

    public DisplayCurrentCondition(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+ temp + "F degrees, Humidity: " + humidity + "%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
