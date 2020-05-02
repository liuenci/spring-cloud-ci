package com.liuencier.consumer.controller;

import com.liuencier.springcloud.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    private static final String URI_PREFIX = "http://localhost:8001";

    @RequestMapping("get/{id}")
    public Dept get(@PathVariable Long id) {
        return restTemplate.getForObject(URI_PREFIX + "/dept/get/" + id, Dept.class);
    }
}
