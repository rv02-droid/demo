package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello versi 3.0.0";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}