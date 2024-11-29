package com.mg.springweatherapp.controller;

import com.mg.springweatherapp.error_handling.WeatherNotFoundException;
import com.mg.springweatherapp.model.Weather;
import com.mg.springweatherapp.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.NoHandlerFoundException;

@Controller
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam("city") String city, Model model) {
        Weather weather = weatherService.getWeather(city);
        System.out.println(weather.name());
        if (weather.name() == null) {
            throw new WeatherNotFoundException("No such city");
        } else {
            model.addAttribute("weather", weather);
            return "weather";
        }
    }
}
