package com.movietime.cityservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="city")
@Getter
@Setter
@AllArgsConstructor
@Data
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonProperty("cityId")
    private long city_id;

    @Column(nullable=false)
    private String city_name;

    private String city_pincode;

    private String city_state;

}
