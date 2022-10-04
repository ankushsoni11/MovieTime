package com.movietime.manager.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("movie-service")
public interface MovieClient {
}
