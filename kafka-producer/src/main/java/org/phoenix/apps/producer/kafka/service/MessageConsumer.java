package org.phoenix.apps.producer.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics="test_topic", groupId="test_group")
    public void consumeMessage(String message) {
        System.out.println("New message consumer: " + message);
    }
}
