package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Higest version is 0.0.5";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}