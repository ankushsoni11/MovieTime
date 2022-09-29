package com.movietime.seat.service;

import com.movietime.seat.entity.Seat;
import com.movietime.seat.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    public List<Seat> getAllSeatByShowId(Long showId) {
        return seatRepository.getSeatbyShowId(showId);
    }

    public Seat addSeat(Seat seat) {
        return seatRepository.save(seat);
    }
}
