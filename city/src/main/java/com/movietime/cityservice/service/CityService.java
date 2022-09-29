package com.movietime.cityservice.service;

import com.movietime.cityservice.entity.City;
import com.movietime.cityservice.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;


    /**
     * find all the cities
     * @return
     */
    public List<City> getCity( ){
        return cityRepository.findAll();
    }

    public Optional<City> getCitiById(long cityID) {
        return cityRepository.findById(cityID);
    }

    public City addCity(City c) {
        return cityRepository.save(c);
    }
}
