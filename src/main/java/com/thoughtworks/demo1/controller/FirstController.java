package com.thoughtworks.demo1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FirstController {
    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String getFirstController() {
        return "Hello World";
    }
}
