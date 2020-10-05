package com.eureka.cilent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CilentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CilentApplication.class, args);
    }

}
