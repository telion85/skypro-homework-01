package com.example.skyprohomework01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String printHello() {
        return "Hello, world!";
    }
}
