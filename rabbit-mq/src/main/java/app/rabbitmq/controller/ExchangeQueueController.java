package app.rabbitmq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class ExchangeQueueController {

    public ExchangeQueueController(AmqpTemplate queueSender) {
        this.queueSender = queueSender;
    }

    private final AmqpTemplate queueSender;

    @GetMapping(path = "/send-exchange")
    public String send(){
        queueSender.convertAndSend("testing-exchange", "routing-key-testing", "Testing Exchange Queue");
        return "ok. done";
    }

}