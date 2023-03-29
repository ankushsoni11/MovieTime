package com.movietime.show.controller;

import com.movietime.show.entity.Show;
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
@Tag(name = "Show API")
@Api(value = "ShowController", description = "REST APIs related to Show Entity!!!!")
abstract public class IShowController {

    @Operation(summary = "Get all show", description = "Get all the shows")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Accepted")
            }
    )
    @GetMapping("/v1/shows")
    abstract ResponseEntity<List<Show>> getShows();

    @GetMapping("/v1/{cityId}/{theaterId}/{movieId}/show")
    abstract ResponseEntity<List<Show>> getTheaterByCityId(Long cityId, Long theaterId, Long movieId);

    @PostMapping("/v1/show")
    abstract ResponseEntity<Show> addShow(Show show);

    @GetMapping("/v1/city/theater/{movieId}/{showDate}/{showTime}")
    abstract ResponseEntity<Show> getShowbyMovieIdShowDateShowTime(Long movieId, String showDate, String showTime);

}
