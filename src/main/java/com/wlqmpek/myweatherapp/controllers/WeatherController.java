package com.wlqmpek.myweatherapp.controllers;

import com.wlqmpek.myweatherapp.models.UserInput;
import com.wlqmpek.myweatherapp.models.Weather5Days;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.wlqmpek.myweatherapp.services.WeatherService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public ResponseEntity<String> getWeather() {

        Weather5Days response = weatherService.get5DaysWeather();
        return new ResponseEntity(response, HttpStatus.OK);
    }

//    @GetMapping(value = "/five-days", consumes = "application/json")
//    public ResponseEntity<Weather5Days> getWeatherForNext5Days(@RequestBody UserInput){
//        Weather5Days response = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/onecall?lat=44.410778&lon=21.933537&exclude=alerts&appid=a7dfe56a12c4fdfacf13a813edfb039f&units=metric", Weather5Days.class);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }

}
