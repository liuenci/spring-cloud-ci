package com.liuencier.springcloud.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Dept {
    private Long deptno;

    private String dname;

    private String dbSource;
}