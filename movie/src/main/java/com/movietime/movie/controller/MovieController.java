package com.movietime.movie.controller;

import com.movietime.movie.entity.Movie;
import com.movietime.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController extends IMovieController {
    @Autowired
    private MovieService movieService;

    @Override
    ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<List<Movie>>(
                movieService.getAllMovies(),
                HttpStatus.OK);
    }

    @Override
    ResponseEntity<List<Movie>> getMovieByCityId(@PathVariable(name = "cityId") Long cityId) {
        return new ResponseEntity<List<Movie>>(
                movieService.getMovieByCityId(cityId),
                HttpStatus.OK);
    }

    @Override
    ResponseEntity<List<Movie>> getMovieByTheaterId(@PathVariable(name = "theaterId") Long theaterId) {
        return new ResponseEntity<List<Movie>>(
                movieService.getMovieByTheaterId(theaterId),
                HttpStatus.OK);
    }

    @Override
    ResponseEntity<List<Movie>> getMovieByTheaterAndCityId(@PathVariable(name = "cityId") Long cityId,
                                                           @PathVariable(name = "theaterId") Long theaterId) {
        return new ResponseEntity<List<Movie>>(
                movieService.getMovieByTheaterAndCityId(cityId, theaterId),
                HttpStatus.OK);
    }

    @Override
    ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        return new ResponseEntity<Movie>(
                movieService.addMovie(movie),
                HttpStatus.OK);
    }

}
