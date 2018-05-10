package com.pgs.workshop;


public class ProducerClientFallback implements ProducerClient {

    private Throwable cause;

    public ProducerClientFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public String getString() {
        return String.format("oops, there was an issue: %s", cause.getMessage());
    }
}
