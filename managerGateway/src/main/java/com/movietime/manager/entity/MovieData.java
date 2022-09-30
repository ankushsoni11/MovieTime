package com.movietime.manager.entity;


import lombok.Data;

import java.util.Date;

@Data
public class MovieData {
    private String city_name;

    private String city_pincode;

    private String city_state;

    private String theater_name;

    private String theater_area;

    private String movie_name;

    private String show_time;

    private Date show_date;

    private String seat_x;
    private String seat_y;

    private int status;
}
