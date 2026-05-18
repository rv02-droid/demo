package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Final Complete Updated form......!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}