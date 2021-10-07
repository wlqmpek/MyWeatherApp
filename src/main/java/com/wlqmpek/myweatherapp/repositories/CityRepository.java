package com.wlqmpek.myweatherapp.repositories;

import com.wlqmpek.myweatherapp.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CityRepository extends JpaRepository<City, UUID> {
    Optional<City> findCityByName(String name);
    Optional<City> findCityByLatitudeAndLongitude(Double latitude, Double longitute);
    Optional<List<City>> findCitiesByNameContaining(String name);
}
