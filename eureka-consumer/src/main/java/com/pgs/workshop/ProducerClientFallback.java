package com.pgs.workshop;

import org.springframework.stereotype.Component;

@Component
public class ProducerClientFallback implements ProducerClient {

    @Override
    public String getString() {
        return "Woops, something went wrong";
    }
}
