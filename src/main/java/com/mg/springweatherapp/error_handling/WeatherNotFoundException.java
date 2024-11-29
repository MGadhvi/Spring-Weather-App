package com.mg.springweatherapp.error_handling;

public class WeatherNotFoundException extends RuntimeException{

    public WeatherNotFoundException(String message) {
        super(message);
    }
}
