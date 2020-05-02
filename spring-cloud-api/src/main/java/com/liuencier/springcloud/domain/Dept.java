package com.liuencier.springcloud.domain;

import lombok.Data;

@Data
public class Dept {
    private Long deptno;

    private String dname;

    private String dbSource;
}