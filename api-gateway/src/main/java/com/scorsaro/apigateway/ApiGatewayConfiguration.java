package com.scorsaro.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/caffeine-exchange/**")
                        .uri("lb://caffeine-exchange"))
                .route(p -> p.path("/caffeine-conversion/**")
                        .uri("lb://caffeine-conversion"))
                .build();
    }

}