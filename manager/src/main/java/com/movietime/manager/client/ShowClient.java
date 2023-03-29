package com.movietime.manager.client;

import com.movietime.manager.entity.Movie;
import com.movietime.manager.entity.Show;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("SHOW-SERVICE")
public interface ShowClient {

    @PostMapping("/show/v1/show")
    abstract ResponseEntity<Show> addShow(@RequestBody Show show);

    @GetMapping(value = "/show/v1/city/theater/{movieId}/{showDate}/{showTime}", consumes = "application/json", produces = "application/json")
    ResponseEntity<Show> getShowbyMovieIdShowDateShowTime(@PathVariable(name="movieId") Long movieId,
                                                          @PathVariable(name="showDate") String showDate,
                                                          @PathVariable(name="showTime") String showTime);
}
