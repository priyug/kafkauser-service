package com.example.kafkauser_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderProducer producer;

    @PostMapping
    public String createOrder(@RequestBody OrderEvent event){
        producer.publishOrder(event);
        return "Order send to kafka";
    }


}
