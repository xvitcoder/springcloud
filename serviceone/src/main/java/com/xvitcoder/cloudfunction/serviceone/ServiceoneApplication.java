package com.xvitcoder.cloudfunction.serviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.function.Supplier;

@EnableAsync
@SpringBootApplication
public class ServiceoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceoneApplication.class, args);
    }

}
