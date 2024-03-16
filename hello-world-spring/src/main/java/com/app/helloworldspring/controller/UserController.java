package com.app.helloworldspring.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping("/id/{id}")
    public String showId(@PathVariable String id) {
        var idLabel = "{" + id + "}";
        return "O parâmetro do usuário é " + idLabel;
    }

    @GetMapping("")
    public String showInformations(@RequestParam Map<String, String> params) {
        return "Bom dia %s".formatted(params.entrySet());
    }

}
