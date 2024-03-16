package com.app.helloworldspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class FirstController {

    @GetMapping("")
    public String helloWorld() {
        return "Hello first endpoint 🥹";
    }
    
}
