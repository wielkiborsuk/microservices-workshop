package com.pgs.workshop;

import feign.FeignException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProducerClientFallback implements ProducerClient {

    private final Throwable cause;
    private final Logger LOGGER = LoggerFactory.getLogger(ProducerClientFallback.class);

    public ProducerClientFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public String getString() {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            LOGGER.debug("404 happened");
        }

        return "Woops, something went wrong";
    }
}
