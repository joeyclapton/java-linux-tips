package com.app.helloworldspring.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/payment")
public class PaymentController {

    @GetMapping(path = "/transfer")
    public String transferValue(@RequestParam() Map<String, String> params) {
        
        return "Transferência realizada com sucesso: " + params;
    }

}
