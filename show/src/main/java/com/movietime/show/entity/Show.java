package com.movietime.show.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "show")
@Getter
@Setter
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long show_id;

    private String show_time;

    private Date show_date;


    private Long movie_id;
}
