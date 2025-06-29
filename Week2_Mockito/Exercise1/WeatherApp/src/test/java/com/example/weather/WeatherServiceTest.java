package com.example.weather;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherServiceTest {
    
    @Test
    public void testWeatherService(){
        WeatherApiClient mockClient = mock(WeatherApiClient.class);
        when(mockClient.getWeather("Delhi")).thenReturn("Sunny 35C");

        WeatherService service = new WeatherService(mockClient);
        String result = service.getCityWeather("Delhi");

        assertEquals("Sunny 35C",result);
    }
}
