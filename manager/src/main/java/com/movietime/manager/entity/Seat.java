package com.movietime.manager.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
public class Seat {
    private long seat_id;
    private String seat_x;
    private String seat_y;
    private int status;
    private Long show_id;
}
