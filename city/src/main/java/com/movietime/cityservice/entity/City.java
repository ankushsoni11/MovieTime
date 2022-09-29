package com.movietime.cityservice.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="city")
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long city_id;

    @Column(nullable=false)
    private String city_name;

    private String city_pincode;

    private String city_state;

}
