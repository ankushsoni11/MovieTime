package com.movietime.manager.controller;

import com.movietime.manager.entity.City;
import com.movietime.manager.entity.MovieData;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Manager API")
@Api(value = "ManagerController", description = "REST APIs related to Manager Entity!!!!")
abstract class IManagerController {

    @PostMapping("v1/manage")
    abstract public ResponseEntity<MovieData> addMovie(MovieData movieData);


    @GetMapping("v1/city/{cityId}")
    abstract public ResponseEntity<City> getCity(Long cityId);
}
