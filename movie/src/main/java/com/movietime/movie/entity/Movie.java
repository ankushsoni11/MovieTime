package com.movietime.movie.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "movie")
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long movie_id;
    private String movie_name;
    private Long city_id;
    private Long theater_id;
}
