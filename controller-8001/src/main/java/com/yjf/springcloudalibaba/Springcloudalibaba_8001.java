package com.yjf.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springcloudalibaba_8001{

    public static void main(String[] args) {
        SpringApplication.run(Springcloudalibaba_8001.class, args);
    }

}
