package com.movietime.seat.repository;

import com.movietime.seat.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {

    @Query(value = "select * from seat where show_id = ?1", nativeQuery = true)
    public List<Seat> getSeatbyShowId(Long showId);
}
