package com.movietime.manager.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Theater {

    private long theater_id;

    private String theater_name;

    private String theater_area;

    private Long city_id;
}
