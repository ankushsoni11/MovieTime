package com.movietime.theater.controller;

import com.movietime.theater.entity.Theater;
import com.movietime.theater.service.TheaterService;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Schema
public class TheaterController extends ITheaterController {

    @Autowired
    private TheaterService theaterService;

    @Override
    ResponseEntity<List<Theater>> getTheaters() {
        return new ResponseEntity<List<Theater>>(
                theaterService.getTheater(),
                HttpStatus.OK);
    }

    @Override
    ResponseEntity<List<Object[]>> getTheaterByCityId(@PathVariable("cityId") Long cityId) {
        return new ResponseEntity<List<Object[]>>(
                theaterService.getTheaterByCityId(cityId),
                HttpStatus.OK);
    }

    @Override
    ResponseEntity<Theater> addTheater(Theater theater) {
        return new ResponseEntity<Theater>(
                theaterService.addTheater(theater),
                HttpStatus.OK);
    }
}
