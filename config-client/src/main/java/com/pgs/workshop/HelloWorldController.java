package com.pgs.workshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloWorldController {

    @Value("${message}")
    private String message;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello " + message;
    }
}
