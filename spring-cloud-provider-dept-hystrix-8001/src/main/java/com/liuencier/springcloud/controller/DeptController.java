package com.liuencier.springcloud.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.liuencier.springcloud.domain.Dept;
import com.liuencier.springcloud.service.DeptService;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: SpringCloudLearningCi
 * @description: 部门controller
 * @author: liuenci
 * @create: 2020-05-02 15:51
 **/
@Slf4j
@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.selectByPrimaryKey(id);
        if (dept == null) {
            throw new RuntimeException("ID不存在;");
        }
        return dept;
    }

    public Dept hystrixGet(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("name不存在;").setDbSource("dbsource不存在;");
    }
}
