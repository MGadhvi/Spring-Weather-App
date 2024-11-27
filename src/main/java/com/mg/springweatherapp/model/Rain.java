package com.mg.springweatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Rain(@JsonProperty("1h") double oneHour) {
}
