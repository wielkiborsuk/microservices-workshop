package com.pgs.workshop;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "config-client", fallback = ProducerClientFallback.class)
public interface ProducerClient {

    @GetMapping("/")
    String getString();
}
