package com.pgs.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class SampleController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${producer.url}")
    private String producerUrl;

    @GetMapping
    public String getMessage() {
        return restTemplate.getForObject(producerUrl, String.class);
    }
}
