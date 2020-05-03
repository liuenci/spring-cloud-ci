package com.liuencier.springcloud.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.liuencier.springcloud.domain.Dept;
import com.liuencier.springcloud.service.DeptService;
import com.netflix.discovery.converters.Auto;
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

    @Autowired
    private DiscoveryClient client;

    @PostMapping("save")
    public int addDept(Dept dept) {
        return deptService.insert(dept);
    }

    @GetMapping("get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.selectByPrimaryKey(id);
    }

    @GetMapping("discovery")
    public Object discovery() {
        List<String> services = client.getServices();
        log.info(">>>>> services:{}", services);

        List<ServiceInstance> instances = client.getInstances("spring-cloud-provider-dept-8001");

        for (ServiceInstance instance : instances) {
            log.info("host:{}", instance.getHost());
        }
        return this.client;
    }
}
