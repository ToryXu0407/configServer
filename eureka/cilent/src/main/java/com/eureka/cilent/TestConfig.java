package com.eureka.cilent;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author toryxu
 * @version 1.0
 * @date 2020/10/9 11:11 下午
 */
@Configuration
public class TestConfig {

    @Value("${server.port}")
    private String port;

//    @Value("${user.userName}")
//    private String userName;


    @PostConstruct
    public void sout() {
        System.out.println("port:" + port);
//        System.out.println("userName:" + userName);
    }
}
