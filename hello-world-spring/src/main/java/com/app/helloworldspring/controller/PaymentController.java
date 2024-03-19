package com.app.helloworldspring.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.helloworldspring.model.PaymentModel;


@RestController
@RequestMapping(path = "/payment")
public class PaymentController {

    // @GetMapping(path = "/transfer")
    // public String transferValue(@RequestParam() Map<String, String> params) {
        
    //     return "Transferência realizada com sucesso: " + params.entrySet();
    // }

    @PostMapping(path = "/transfer") 
    public String transferValue(@RequestBody PaymentModel payment) {
        var key = payment.key();
        var amount = payment.amount();

        return "Transferência %s no valor de %s reais realizada com sucesso".formatted(key, amount);
    }

    @PostMapping(path = "/token") 
    public String getToken(@RequestHeader String token) {
        return "O token gerado foi: %s".formatted(token);
    }

    @PostMapping(path = "/user-security")
    public String getUserSecurity(@RequestHeader Map<String, String> headers) {
        return "Informações de segurança do usuário: %s".formatted(headers.entrySet());
    }

}
