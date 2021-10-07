package com.wlqmpek.myweatherapp.services;

import com.wlqmpek.myweatherapp.models.Weather5Days;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
    private RestTemplate restTemplate = restTemplateBuilder.build();
    private final String API = "https://api.openweathermap.org/data/2.5/onecall?lat=44.410778&lon=21.933537&exclude=alerts&appid=a7dfe56a12c4fdfacf13a813edfb039f&units=metric";

    public Weather5Days get5DaysWeather(){
        Weather5Days fiveDaysWeather = restTemplate.getForObject(API, Weather5Days.class);
        return fiveDaysWeather;
    }

}
