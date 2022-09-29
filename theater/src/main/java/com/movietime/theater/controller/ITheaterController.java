package com.movietime.theater.controller;

import com.movietime.theater.entity.Theater;
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
@Tag(name = "Theater API")
@Api(value = "TheaterController", description = "REST APIs related to Theater Entity!!!!")
abstract public class ITheaterController {


    @Operation(summary = "Get all city", description = "Get all the cities")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Accepted")
            }
    )
    @GetMapping("/v1/theaters")
    abstract ResponseEntity<List<Theater>> getTheaters();

    @GetMapping("/v1/{cityId}/theater")
    abstract ResponseEntity<List<Object[]>> getTheaterByCityId(Long cityId);

    @PostMapping("/v1/theater")
    abstract ResponseEntity<Theater> addTheater(Theater theater);
}
