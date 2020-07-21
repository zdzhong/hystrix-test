package com.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HystrixTestProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTestProviderApplication.class, args);
    }

}
