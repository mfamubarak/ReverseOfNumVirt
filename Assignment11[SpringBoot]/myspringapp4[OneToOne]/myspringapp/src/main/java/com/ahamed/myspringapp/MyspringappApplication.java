package com.ahamed.myspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.ahamed.myspringapp.repository")
@SpringBootApplication
public class MyspringappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringappApplication.class, args);
    }

}
