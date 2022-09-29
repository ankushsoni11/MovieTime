package com.movietime.theater.service;

import com.movietime.theater.entity.Theater;
import com.movietime.theater.repository.TheaterRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterService {

    @Autowired
    private TheaterRespository theaterRespository;


    /**
     * find all the cities
     * @return
     */
    public List<Theater> getTheater( ){
        return theaterRespository.findAll();
    }

    public List<Object[]> getTheaterByCityId(long cityID) {
        return theaterRespository.getTheaterByCityId(cityID);
    }

    public Theater addTheater(Theater theater) {
        return theaterRespository.save(theater);
    }
}
