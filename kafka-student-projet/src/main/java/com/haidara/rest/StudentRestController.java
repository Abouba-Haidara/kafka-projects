package com.haidara.rest;

import com.haidara.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/kafka")
public class StudentRestController {

    private final Producer producer;
    @Autowired
    public StudentRestController(Producer producer) {
        this.producer = producer;
    }
    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }

}
