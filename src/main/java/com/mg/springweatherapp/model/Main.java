package com.mg.springweatherapp.model;

public record Main(
        double temp,
        double feels_like,
        double temp_min,
        double temp_max,
        int pressure,
        int humidity,
        Integer sea_level,
        Integer grnd_level
) {}

