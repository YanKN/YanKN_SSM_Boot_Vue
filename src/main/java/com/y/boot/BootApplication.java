package com.y.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        System.out.println("BootApplication");
        SpringApplication.run(BootApplication.class, args);
    }

}
