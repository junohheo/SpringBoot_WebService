package com.example.springboot_webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
public class SpringBootWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebServiceApplication.class, args);
    }

}
