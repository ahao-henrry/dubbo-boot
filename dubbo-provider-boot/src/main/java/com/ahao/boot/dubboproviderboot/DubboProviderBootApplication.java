package com.ahao.boot.dubboproviderboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

// @EnableDubbo
@EnableHystrix
@SpringBootApplication
public class DubboProviderBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderBootApplication.class, args);
    }

}
