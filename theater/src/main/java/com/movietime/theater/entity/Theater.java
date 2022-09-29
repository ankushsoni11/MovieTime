package com.movietime.theater.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="theater")
@Getter
@Setter
public class Theater {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long theater_id;

    private String theater_name;

    private String theater_area;

    private Long city_id;
}
