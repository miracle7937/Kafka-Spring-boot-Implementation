package com.example.kafkaexample.listeners;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listeners {

    @KafkaListener(topics = "mimiTopic", groupId = "groupID-mimiTopic")
    void  listener(String data){
        System.out.println("Lister receieved : "+ data + " \uD83D\uDE0A");
    }
}
