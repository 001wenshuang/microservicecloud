package com.atguigu.springcloud.service.impl;


import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud.service.impl
 * @date 2019/1/17
 */

@Service
public class DeptServiceImpl implements DeptService {


    @Autowired

    private DeptDao dao ;



    @Override

    public boolean add(Dept dept)

    {

        return dao.addDept(dept);

    }



    @Override

    public Dept get(Long id)

    {

        return dao.findById(id);

    }



    @Override

    public List<Dept> list()

    {

        return dao.findAll();

    }
}