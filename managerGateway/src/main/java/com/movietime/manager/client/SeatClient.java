package com.movietime.manager.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("seat-service")
public interface SeatClient {
}
