package com.movietime.manager.entity;


import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
public class Movie {
    private Long movie_id;
    private String movie_name;
    private Long city_id;
    private Long theater_id;
}
