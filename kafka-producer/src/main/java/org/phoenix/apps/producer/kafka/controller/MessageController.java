package org.phoenix.apps.producer.kafka.controller;

import org.apache.kafka.clients.producer.Producer;
import org.phoenix.apps.producer.kafka.model.Book;
import org.phoenix.apps.producer.kafka.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageProducer producer;

    public MessageController(MessageProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public void publishEvents(@RequestParam String message) {
        this.producer.sendMessage(message);
    }
}
