package com.movietime.manager.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("theater-service")
public interface TheaterClient {
}
