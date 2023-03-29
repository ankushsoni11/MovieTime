package com.movietime.movie.controller;

import com.movietime.movie.entity.Movie;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Movie API")
@Api(value = "MovieController", description = "REST APIs related to Movie Entity!!!!")
abstract public class IMovieController {


    @Operation(summary = "Get all movie", description = "Get all the movie")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Accepted")
            }
    )
    @GetMapping("/v1/movies")
    abstract ResponseEntity<List<Movie>> getMovies();

    @GetMapping("/v1/{cityId}/theater/movie")
    abstract ResponseEntity<List<Movie>> getMovieByCityId(Long cityId);


    @GetMapping("/v1/city/{theaterId}/movie")
    abstract ResponseEntity<List<Movie>> getMovieByTheaterId(Long theaterId);


    @GetMapping("/v1/city/{theaterId}/{movieName}")
    abstract ResponseEntity<List<Movie>> getMovieByTheaterIdAndMovieName(Long theaterId, String movieName);

    @PostMapping("/v1/movie")
    abstract ResponseEntity<Movie> addMovie(Movie movie);


}
