package com.knoldus.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.knoldus.learning.repository")
public class SpringbootMavenApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMavenApplication.class, args);
    }

}
