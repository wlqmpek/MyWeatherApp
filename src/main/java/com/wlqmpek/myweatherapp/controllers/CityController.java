package com.wlqmpek.myweatherapp.controllers;

import com.wlqmpek.myweatherapp.Util.Scraper;
import com.wlqmpek.myweatherapp.models.City;
import com.wlqmpek.myweatherapp.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/cities")
public class CityController {

    @Autowired
    private CityService cityService;



    @GetMapping()
    public ResponseEntity<List<City>> searchForCity(@RequestParam String cityName) {
        Scraper.scrapeForCity(cityName);
        return null;
    }

    @GetMapping(value = "/cities-suggestion")
    public ResponseEntity<List<City>> getCitiesSuggestion(@RequestParam String cityName, @RequestParam(required = false) String countryName) {
        List<City> response = cityService.findCitiesByNameLike(cityName);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }



}
