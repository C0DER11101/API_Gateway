package com.jsp.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("workflow-definition", r -> r.path("/workflow-def/**")
                        .uri("http://localhost:8081"))
                .route("ai-service", r -> r.path("/ai-service/**")
                        .uri("http://localhost:8082"))
                .build();
    }

}