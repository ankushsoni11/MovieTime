package com.movietime.manager.client;


import com.movietime.manager.entity.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "CITY-SERVICE")
public interface CityClient {
    @PostMapping("/city/v1/city")
    ResponseEntity<City> addCity(@RequestBody City city);

    @GetMapping(value = "/city/v1/city/{cityId}", consumes = "application/json", produces = "application/json")
    ResponseEntity<City> getCitiById(@PathVariable("cityId") Long cityId);

    @GetMapping("/city/v1/city/name/{cityName}")
    ResponseEntity<City> getCitiByName(@PathVariable("cityName") String cityName);
}

