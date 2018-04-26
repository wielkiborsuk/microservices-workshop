package com.pgs.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @Autowired
    private ProducerClient producerClient;

    @GetMapping
    public String getMessage() {
        return producerClient.getString();
    }
}
