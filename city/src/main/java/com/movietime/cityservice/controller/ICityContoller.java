package com.movietime.cityservice.controller;

import com.movietime.cityservice.entity.City;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Tag(name = "City API")
@Api(value = "CityController", description = "REST APIs related to City Entity!!!!")
abstract class ICityContoller {

    @Operation(summary = "Get all city", description = "Get all the cities")
    @ApiResponses(
            value = {
                 @ApiResponse(responseCode = "200", description = "Accepted")
            }
    )
    @GetMapping("/v1/cities")
    abstract ResponseEntity<List<City>> getCities();

    @GetMapping("/v1/city/{cityId}")
    abstract ResponseEntity<City> getCitiById(Long cityId);


    @PostMapping("/v1/city")
    abstract ResponseEntity<City> addCity(City c);
}
