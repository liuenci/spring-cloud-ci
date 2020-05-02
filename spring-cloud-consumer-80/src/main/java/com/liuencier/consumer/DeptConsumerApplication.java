package com.liuencier.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: SpringCloudLearningCi
 * @description:
 * @author: liuenci
 * @create: 2020-05-02 16:24
 **/
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class, args);
    }
}
