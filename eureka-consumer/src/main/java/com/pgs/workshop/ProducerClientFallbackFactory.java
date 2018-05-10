package com.pgs.workshop;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ProducerClientFallbackFactory implements FallbackFactory<ProducerClient> {

    @Override
    public ProducerClient create(Throwable cause) {
        return new ProducerClientFallback(cause);
    }
}
