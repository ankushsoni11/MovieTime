package com.movietime.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BookingGateway {
    public static void main(String[] args) {
        SpringApplication.run(BookingGateway.class, args);
    }
}
