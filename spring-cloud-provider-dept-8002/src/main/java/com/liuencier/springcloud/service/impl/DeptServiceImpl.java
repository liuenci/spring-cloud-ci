package com.liuencier.springcloud.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.liuencier.springcloud.domain.Dept;
import com.liuencier.springcloud.mapper.DeptMapper;
import com.liuencier.springcloud.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService{

    @Resource
    private DeptMapper deptMapper;

    @Override
    public int deleteByPrimaryKey(Long deptno) {
        return deptMapper.deleteByPrimaryKey(deptno);
    }

    @Override
    public int insert(Dept record) {
        return deptMapper.insert(record);
    }

    @Override
    public int insertSelective(Dept record) {
        return deptMapper.insertSelective(record);
    }

    @Override
    public Dept selectByPrimaryKey(Long deptno) {
        return deptMapper.selectByPrimaryKey(deptno);
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return deptMapper.updateByPrimaryKey(record);
    }

}
