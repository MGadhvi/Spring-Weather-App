package com.mg.springweatherapp.model;

import java.util.List;

public record Weather(
        Coord coord,
        List<WeatherDescription> weather,
        String base,
        Main main,
        int visibility,
        Wind wind,
        Clouds clouds,
        long dt,
        Sys sys,
        int timezone,
        int id,
        String name,
        int cod,
        Rain rain
) {}
