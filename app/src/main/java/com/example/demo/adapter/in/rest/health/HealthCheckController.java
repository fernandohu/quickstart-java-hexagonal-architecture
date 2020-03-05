package com.example.demo.adapter.in.rest.health;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping(value = "/healthcheck")
    @ResponseStatus(HttpStatus.OK)
    public String doHealthCheck() {
        // @Todo Write code for the health check here
        return "OK";
    }
}
