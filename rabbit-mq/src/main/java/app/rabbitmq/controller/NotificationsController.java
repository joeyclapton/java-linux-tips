package app.rabbitmq.controller;
import app.rabbitmq.broker.QueueSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/notifications")
public class NotificationsController {

    @Autowired
    private QueueSender queueSender;

    @PostMapping(path = "/send") 
    public String send(@RequestBody String message) {

        queueSender.send(message);

        return "Ok. Done";
    }

}