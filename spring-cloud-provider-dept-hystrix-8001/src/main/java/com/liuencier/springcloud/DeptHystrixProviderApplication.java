package com.liuencier.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: SpringCloudLearningCi
 * @description:
 * @author: liuenci
 * @create: 2020-05-02 15:55
 **/
@EnableEurekaClient // 服务注册
@SpringBootApplication
@EnableDiscoveryClient // 服务发现
@EnableCircuitBreaker // 断路器
public class DeptHystrixProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptHystrixProviderApplication.class, args);
    }
}
