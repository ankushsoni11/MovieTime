package com.movietime.seat.controller;

import com.movietime.seat.entity.Seat;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Seat API")
@Api(value = "SeatController", description = "REST APIs related to Seat Entity!!!!")
abstract public class
ISeatController {

    @GetMapping("/v1/{seatId}/seat")
    abstract public ResponseEntity<List<Seat>> getSeatBySeatId(Long seatId);

    @PostMapping("/v1/seat")
    abstract public ResponseEntity<Seat> addSeat(Seat seat);
}
