package com.liuencier.consumer.controller;

import com.liuencier.springcloud.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: SpringCloudLearningCi
 * @description:
 * @author: liuenci
 * @create: 2020-05-02 16:15
 **/
@RestController
@RequestMapping("consumer/dept")
public class DeptConsumerController {


    @Autowired
    private RestTemplate restTemplate;

    //    private static final String URI_PREFIX = "http://localhost:8001";
    // 通过 ribbon 来达到负载均衡的效果
    private static final String URI_PREFIX = "http://SPRING-CLOUD-PROVIDER-DEPT";

    @RequestMapping("get/{id}")
    public Dept get(@PathVariable Long id) {
        return restTemplate.getForObject(URI_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("list")
    public List<Dept> list() {
        return restTemplate.getForObject(URI_PREFIX + "/dept/list", List.class);
    }
}
