package com.example.filemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.filemanager.*" })
@EnableJpaRepositories(basePackages = "com.example.filemanager.dao")
@EntityScan(basePackages = "com.example.filemanager.domain")
public class FilemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilemanagerApplication.class, args);
    }

}
