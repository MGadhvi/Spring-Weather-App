package com.mg.springweatherapp.services;

import com.mg.springweatherapp.error_handling.WeatherNotFoundException;
import com.mg.springweatherapp.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class WeatherService {

    @Value("${openweather.api.key}")
    private String apiKey;

    @Value("${openweather.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public Weather getWeather(String city) {
        String url = String.format("%s?q=%s&appid=%s&units=metric", apiUrl, city, apiKey);
        String jsonResponse = restTemplate.getForObject(url, String.class);
        try {
            return objectMapper.readValue(jsonResponse, Weather.class);
        } catch (Exception e) {
            throw new WeatherNotFoundException("Failed to parse JSON");
        }
    }
}

