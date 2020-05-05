package com.liuencier.consumer.controller;

import com.liuencier.springcloud.domain.Dept;
import com.liuencier.springcloud.service.DeptClientService;
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
@RequestMapping("feign/dept")
public class DeptConsumerController {


    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("get/{id}")
    public Dept get(@PathVariable Long id) {
        return deptClientService.get(id);
    }

    @GetMapping("list")
    public List<Dept> list() {
        return deptClientService.list();
    }
}
