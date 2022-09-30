package com.movietime.manager.client;


import com.movietime.manager.entity.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "CITY-SERVICE", url = "http://localhost:8000/city")
public interface CityClient {
    @PostMapping("/v1/city")
    List addCity();

    @GetMapping(value = "/v1/city/{cityId}", consumes = "application/json", produces = "application/json")
    ResponseEntity<City> getCitiById(Long cityId);
}

