package com.liuencier.springcloud.service;

import com.liuencier.springcloud.domain.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "SPRING-CLOUD-PROVIDER-DEPT")
public interface DeptClientService {

    @GetMapping("dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping("dept/list")
    List<Dept> list();
}
