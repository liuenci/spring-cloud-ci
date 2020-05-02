package com.liuencier.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: SpringCloudLearningCi
 * @description:
 * @author: liuenci
 * @create: 2020-05-02 16:53
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer01Application.class, args);
    }
}
