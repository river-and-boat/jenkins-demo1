package com.thoughtworks.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String getFirstController() {
        return "Hello World";
    }
}
