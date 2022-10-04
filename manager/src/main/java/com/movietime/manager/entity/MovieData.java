package com.movietime.manager.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieData {
    private City city;

    private Theater theater;

    private Movie movie;

    private Show show;

    private Seat seat;

}
