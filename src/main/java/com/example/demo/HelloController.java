package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello version ..... 0.0.12";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}