package com.jsp.api_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(value = "/greetings")
    public String greet() {
        return "Hello from Api_gateway Eureka client!";
    }

}