package com.tan.mao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tan.mao"})
public class MybatisHandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisHandlerApplication.class, args);
    }

}

