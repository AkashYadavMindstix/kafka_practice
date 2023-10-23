package com.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.demo.producerService.TopicProducer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    @Autowired
    TopicProducer topicProducer;

    @GetMapping(value = "/send")
    public void sendMsg(@RequestParam("message") String message) {
        log.info("Request received in Kafka Producer");
        topicProducer.sendMsg(message);
    }
}
