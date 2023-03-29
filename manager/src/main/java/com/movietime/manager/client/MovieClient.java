package com.movietime.manager.client;

import com.movietime.manager.entity.City;
import com.movietime.manager.entity.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("MOVIE-SERVICE")
public interface MovieClient {

    @PostMapping("/movie/v1/movie")
    ResponseEntity<Movie> addMovie(@RequestBody Movie movie);

    @GetMapping(value = "/movie/v1/city/{theaterId}/{movieName}", consumes = "application/json", produces = "application/json")
    ResponseEntity<Movie> getMovieByTheaterIdAndMovieName(@PathVariable("theaterId") Long theaterId,
                                       @PathVariable("movieName") String movieName);

    @GetMapping(value = "/movie/v1/movie/{movieId}", consumes = "application/json", produces = "application/json")
    ResponseEntity<Movie> getMovieById(@PathVariable("movieId") Long movieId);
}
