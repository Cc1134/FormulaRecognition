package com.example.frserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//这个类是整个SpringBoot的入口类，必须要有。
@SpringBootApplication
public class FRserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(FRserverApplication.class, args);
    }

}
