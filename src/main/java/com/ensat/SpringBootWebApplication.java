package com.ensat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class SpringBootWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
