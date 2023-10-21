package com.kafka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class DemoKafkaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoKafkaProducerApplication.class, args);
    }

}
