package com.app.helloworldspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping("")
    public String getInformations() {
        return "Name: Joey Clapton, Age: 24";
    }

}
