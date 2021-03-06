package com.example.emlakburadaemail;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

@SpringBootApplication
@EnableJms
public class EmlakburadaEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmlakburadaEmailApplication.class, args);
    }

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("emlakburada.queue");
    }
}
