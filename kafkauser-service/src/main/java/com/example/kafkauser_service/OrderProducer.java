package com.example.kafkauser_service;

import org.springframework.kafka.core.KafkaTemplate;

public class OrderProducer {

    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public void publishOrder(OrderEvent event){
        kafkaTemplate.send("order-topic", event);
    }


}

