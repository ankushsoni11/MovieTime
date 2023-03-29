package com.movietime.seat.controller;

import com.movietime.seat.entity.Seat;
import com.movietime.seat.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class SeatController extends ISeatController {

    @Autowired
    private SeatService service;
    @Override
    public ResponseEntity<List<Seat>> getSeatBySeatId(@PathVariable(name = "seatId") Long seatId) {
        return new ResponseEntity<List<Seat>>(
                service.getAllSeatByShowId(seatId),
                HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Seat> addSeat(@RequestBody Seat seat) {
        return new ResponseEntity<Seat>(
                service.addSeat(seat),
                HttpStatus.OK);
    }
}
