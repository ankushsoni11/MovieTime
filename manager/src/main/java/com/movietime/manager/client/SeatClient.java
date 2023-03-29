package com.movietime.manager.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("SEAT-SERVICE")
public interface SeatClient {
}
