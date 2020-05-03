package com.liuencier.springcloud.service;

import com.liuencier.springcloud.domain.Dept;
public interface DeptService{


    int deleteByPrimaryKey(Long deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long deptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

}
