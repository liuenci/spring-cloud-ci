package com.liuencier.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: SpringCloudLearningCi
 * @description:
 * @author: liuenci
 * @create: 2020-05-02 16:24
 **/
// Ribbon 和 Eureka 整合之后，客户端可以直接调用，不用关心 IP 地址和端口号
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.liuencier.springcloud"})
@SpringBootApplication
@ComponentScan("com.liuencier.springcloud")
public class FeignDeptConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumerApplication.class, args);
    }
}
