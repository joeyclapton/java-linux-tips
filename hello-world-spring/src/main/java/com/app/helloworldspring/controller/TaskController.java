package com.app.helloworldspring.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    
    @GetMapping("/{id}")
    public String getInformations(@RequestParam Map<String, String> queryParams, @PathVariable String id) {
        var data = queryParams.entrySet();

        return "Dados da tarefa { %s }: %s".formatted(id, data);
    }

}
