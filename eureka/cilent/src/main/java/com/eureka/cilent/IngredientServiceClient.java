package com.eureka.cilent;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author toryxu
 * @version 1.0
 * @date 2020/10/5 2:30 下午
 */
@Component
public class IngredientServiceClient {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    public IngredientServiceClient() {
    }
}
