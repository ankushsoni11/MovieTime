package com.movietime.manager.entity;

import lombok.*;

import java.util.Date;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@ToString
@Setter
public class Show {

    private Long show_id;

    private String show_time;

    private Date show_date;


    private Long movie_id;
}
