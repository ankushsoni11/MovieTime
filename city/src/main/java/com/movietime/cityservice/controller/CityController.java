package com.movietime.cityservice.controller;

import com.movietime.cityservice.entity.City;
import com.movietime.cityservice.service.CityService;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Schema
@RequestMapping("/city")
public class CityController extends ICityContoller {

    @Autowired
    private CityService cityService;

    @Override
    ResponseEntity<List<City>> getCities() {
        return new ResponseEntity<List<City>>(
                cityService.getCity(),
                HttpStatus.OK);

    }

    @Override
    ResponseEntity<City> getCitiById(@PathVariable("cityId") Long cityId) {
        return new ResponseEntity<City>(
                cityService.getCitiById(cityId).get(),
                HttpStatus.OK);
    }

    @Override
    ResponseEntity<City> addCity(@RequestBody City c) {
        return new ResponseEntity<City>(
                cityService.addCity(c),
                HttpStatus.OK);
    }
}
