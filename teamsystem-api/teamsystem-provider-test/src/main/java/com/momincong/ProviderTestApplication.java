package com.momincong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTestApplication.class, args);
    }

}