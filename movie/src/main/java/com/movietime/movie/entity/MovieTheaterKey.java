package com.movietime.movie.entity;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class MovieTheaterKey implements Serializable {
    private Long movie_id;
    private Long theater_id;
}