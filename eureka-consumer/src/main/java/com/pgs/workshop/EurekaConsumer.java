package com.pgs.workshop;

import feign.RequestInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class EurekaConsumer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer.class, args);
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return template -> template.header("test", "test");
    }
}
