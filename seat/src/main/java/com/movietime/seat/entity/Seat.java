package com.movietime.seat.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "seat")
@Getter
@Setter
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long seat_id;
    private String seat_x;
    private String seat_y;
    private int status;
    private Long show_id;
}
