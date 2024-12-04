package org.phoenix.apps.producer.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
public class EventStreamPublisher {

    public static void main(String[] args) {
        SpringApplication.run(EventStreamPublisher.class);
    }
}
