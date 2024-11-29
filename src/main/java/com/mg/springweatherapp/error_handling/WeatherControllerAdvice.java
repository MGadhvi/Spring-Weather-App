package com.mg.springweatherapp.error_handling;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class WeatherControllerAdvice {

        @ExceptionHandler(HttpClientErrorException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        public String handleNotFound(Model model) {
            model.addAttribute("errorMessage", "No City found");
            return "404";
        }
    }
