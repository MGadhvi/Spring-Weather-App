package com.mg.springweatherapp.model;

public record Sys(
        int type,
        int id,
        String country,
        long sunrise,
        long sunset
) {}
