package com.example.weather;

public class WeatherService {
    private WeatherApiClient client;

    public WeatherService(WeatherApiClient client){
        this.client=client;
    }

    public String getCityWeather(String city){
        return client.getWeather(city);
    }
}
