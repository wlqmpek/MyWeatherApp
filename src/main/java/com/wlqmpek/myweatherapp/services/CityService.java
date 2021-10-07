package com.wlqmpek.myweatherapp.services;

import com.wlqmpek.myweatherapp.models.City;
import com.wlqmpek.myweatherapp.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public void save(City city) {
        city.setName(city.getName().toLowerCase());
        cityRepository.save(city);
    }

    public City findCItyByLatitudeAndLongitude(Double latitude, Double longitude) {
        Optional<City> optionalCIty = cityRepository.findCityByLatitudeAndLongitude(latitude, longitude);
        if(optionalCIty.isPresent()){
            return optionalCIty.get();
        } else {
            System.out.println("City with this coordinated does not exist in the DB!");
        }
        return null;
    }

    public City findCityByName(String name) {
        City city = null;
        Optional<City> optionalCity = cityRepository.findCityByName(name.toLowerCase());
        if(optionalCity.isPresent()){
            city = optionalCity.get();
        } else {
            System.out.printf("City %s does not exist in the DB!\n", name);
        }
        return city;
    }

    public List<City> findCitiesByNameLike(String name) {
        List<City> cities = new ArrayList<>();
        Optional<List<City>> optionalCities = cityRepository.findCitiesByNameContaining(name);
        if(optionalCities.isPresent()) {
            cities = optionalCities.get();
        }
        return cities;
    }

    public City scrapeGoogleForCityInfo(String cityName) {
        return null;
    }

}
