package com.sks.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
public class ControllerPublisher {

    @Autowired
    private RabbitTemplate template;

    @GetMapping("/{message}")
    public String publishStringMessage(@PathVariable String message) {
        String out="controller reached with data "+message;
        System.out.println(out);

        return out;
    }

    @GetMapping("/")
    public String publishObjectMessage() {
        ObjectMessage01 objectMessage01= new ObjectMessage01();
        objectMessage01.setMessage("hello");
        objectMessage01.setMessageId(UUID.randomUUID().toString());
        objectMessage01.setMessageDate(new Date());
        String out="controller reached without message returning 'hello' timestamped "+ objectMessage01.toString();
        System.out.println(out);

        return out;
    }



}