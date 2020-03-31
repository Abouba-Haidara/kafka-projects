package com.haidara.rest;

import com.haidara.model.Society;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class BourseRestController {

    private static final String TOPIC = "society1";

    @Autowired
    KafkaTemplate<String, Society> societyKafkaTemplate;

    @GetMapping("/publish/str/{msg}")
    public String getBourse(@PathVariable("msg") String msg){
        return "";
    }

    @GetMapping("/publish/society/{name}")
    public String postSociety(@PathVariable("name") String name){
        societyKafkaTemplate.send(TOPIC, new Society(1,name,"fass", "33 03 03 03"));
        return "success!";
    }
}
