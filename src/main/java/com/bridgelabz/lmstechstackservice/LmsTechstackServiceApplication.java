package com.bridgelabz.lmstechstackservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LmsTechstackServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LmsTechstackServiceApplication.class, args);
    }

}
