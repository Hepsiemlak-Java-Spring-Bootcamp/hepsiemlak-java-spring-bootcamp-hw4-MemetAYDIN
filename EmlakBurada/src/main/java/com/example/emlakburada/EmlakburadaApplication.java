package com.example.emlakburada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = {})
public class EmlakburadaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmlakburadaApplication.class, args);
    }


}
