package com.ahao.dubbo.dubboconsumerboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

// @EnableDubbo
@ImportResource(locations = "classpath:consumer.xml")
@EnableHystrix
@SpringBootApplication
public class DubboConsumerBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerBootApplication.class, args);
    }

}
