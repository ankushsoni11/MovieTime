package com.movietime.manager.client;

import com.movietime.manager.entity.City;
import com.movietime.manager.entity.Theater;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("THEATER-SERVICE")
public interface TheaterClient {

    @PostMapping("/theater/v1/theater")
    ResponseEntity<Theater> addTheater(@RequestBody Theater theater);

    @GetMapping(value = "/theater/v1/theater/{theaterId}", consumes = "application/json", produces = "application/json")
    ResponseEntity<Theater> getTheaterById(@PathVariable("theaterId") Long theaterId);

    @GetMapping(value = "/theater/v1/{cityId}/theater/{theaterName}", consumes = "application/json", produces = "application/json")
    ResponseEntity<Theater> getTheaterByCityIdAndName(@PathVariable("cityId") Long cityId,
                                                      @PathVariable("theaterName") String theaterName);
}
