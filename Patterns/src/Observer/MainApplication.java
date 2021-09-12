package Observer;

public class MainApplication {
    public static void main(String []args) {
        WeatherData weatherData = new WeatherData();
        DisplayCurrentCondition displayCurrentCondition = new DisplayCurrentCondition(weatherData);
        weatherData.setMeasurements(80, 65, 67.7f);
    }
}
