package com.global.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Spring Boot application.
 */
@SpringBootApplication
public class DemoApplication {

        /**
         * Boots the application using Spring Boot's {@link SpringApplication}.
         */
        public static void main(String[] args) {
                SpringApplication.run(DemoApplication.class, args);
        }

}
