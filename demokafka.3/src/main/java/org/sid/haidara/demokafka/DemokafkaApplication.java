package org.sid.haidara.demokafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class DemokafkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemokafkaApplication.class, args);
    }
}
