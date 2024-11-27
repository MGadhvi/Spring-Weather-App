package com.mg.springweatherapp.service;

import com.mg.springweatherapp.model.Weather;
import com.mg.springweatherapp.services.WeatherService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
public class WeatherServiceTests {

    @Autowired
    WeatherService weatherService;

    @Nested
    @DisplayName("London Tests")
    class LondonTests {
        @Test
        @DisplayName("Check that city is London")
        void check_that_service_returns_object() {
            Weather londonWeather = weatherService.getWeather("London");
            Assertions.assertEquals("London", londonWeather.name());
        }
    }
}
