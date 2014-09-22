package ch02_weather_st;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
