package com.yjf.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class Springcloudalibaba_8101 {

    public static void main(String[] args) {
        SpringApplication.run(Springcloudalibaba_8101.class, args);
    }


    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/nihao")
                        .filters(
                                f -> f.stripPrefix(1)
                        )
                        .uri("http://www.yjf.com:8102/get/getMapping")   //不知道为什么 http://www.baidu.com 不能跳
                ).build();
    }
}
