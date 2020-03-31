package org.sid.haidara.demokafka.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestKafkaController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    @GetMapping("/send/{message}/{topic}")
    public String postMessage(@PathVariable("message") String message, @PathVariable("topic") String topic){
       kafkaTemplate.send(topic, message);
        return "successfully";
    }
}
