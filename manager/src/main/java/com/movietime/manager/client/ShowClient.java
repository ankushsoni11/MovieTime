package com.movietime.manager.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("show-service")
public interface ShowClient {
}
