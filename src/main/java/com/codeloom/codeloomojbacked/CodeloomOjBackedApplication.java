package com.codeloom.codeloomojbacked;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CodeloomOjBackedApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeloomOjBackedApplication.class, args);
    }

}
