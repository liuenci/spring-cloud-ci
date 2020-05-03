package com.liuencier.consumer;

import com.liuencier.consumer.rule.CierRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: SpringCloudLearningCi
 * @description:
 * @author: liuenci
 * @create: 2020-05-02 16:24
 **/
// Ribbon 和 Eureka 整合之后，客户端可以直接调用，不用关心 IP 地址和端口号
@EnableEurekaClient
@SpringBootApplication
// 在微服务启动的时候就能去加载我们自定义的的Ribbon类
@RibbonClient(name = "spring-cloud-provider-dept", configuration = CierRule.class)
public class DeptConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class, args);
    }
}
