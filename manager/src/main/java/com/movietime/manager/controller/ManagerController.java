package com.movietime.manager.controller;

import com.movietime.manager.client.*;
import com.movietime.manager.entity.City;
import com.movietime.manager.entity.MovieData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManagerController extends IManagerController {

    @Autowired
    private CityClient cityClient;

    @Autowired
    private MovieClient movieClient;

    @Autowired
    private SeatClient seatClient;

    @Autowired
    private ShowClient showClient;

    @Autowired
    private TheaterClient theaterClient;


    @Override
    public ResponseEntity<MovieData> addMovie(@RequestBody MovieData movieData) {
        ResponseEntity<City> city = cityClient.addCity(movieData.getCity());
        Long cityId = city.getBody().getCityId();
        return null;
    }

    @Override
    public ResponseEntity<City> getCity(@PathVariable(name = "cityId") Long cityId) {
        return cityClient.getCitiById(cityId);
    }
}
