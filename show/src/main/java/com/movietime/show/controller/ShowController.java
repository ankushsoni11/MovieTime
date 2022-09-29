package com.movietime.show.controller;

import com.movietime.show.entity.Show;
import com.movietime.show.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowController extends IShowController {

    @Autowired
    private ShowService showService;

    @Override
    ResponseEntity<List<Show>> getShows() {
        return new ResponseEntity<List<Show>>(
                showService.getAllShow(),
                HttpStatus.OK);
    }

    @Override
    ResponseEntity<List<Show>> getTheaterByCityId(@PathVariable(name = "cityId") Long cityId,
                                                  @PathVariable(name = "theaterId") Long theaterId,
                                                  @PathVariable(name = "movieId") Long movieId) {
        return new ResponseEntity<List<Show>>(
                showService.getShowByCityTheaterMovie(cityId, theaterId, movieId),
                HttpStatus.OK);
    }

    @Override
    ResponseEntity<Show> addShow(@RequestBody Show show) {
        return new ResponseEntity<Show>(
                showService.addShow(show),
                HttpStatus.OK);
    }
}
