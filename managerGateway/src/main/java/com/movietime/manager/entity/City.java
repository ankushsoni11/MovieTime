package com.movietime.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class City implements Serializable {

    private long city_id;

    private String city_name;

    private String city_pincode;

    private String city_state;


}
