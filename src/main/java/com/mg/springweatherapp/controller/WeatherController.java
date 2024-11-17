package com.mg.springweatherapp.controller;

import com.mg.springweatherapp.model.Weather;
import com.mg.springweatherapp.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam("city") String city, Model model) {
        Weather weather = weatherService.getWeather(city);
        model.addAttribute("weather", weather);
        return "weather";
    }
}
