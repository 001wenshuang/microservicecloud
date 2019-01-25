package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud.controller
 * @date 2019/1/17
 */


@RestController  //rest 风格访问

public class DeptController_Consumer

{

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";


    @Autowired

    private RestTemplate restTemplate;



    @RequestMapping(value="/consumer/dept/add") //rest 风格访问

    public boolean add(Dept dept)

    {
            //rest魔板 发送post 请求
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);

    }



    @RequestMapping(value="/consumer/dept/get/{id}")

    public Dept get(@PathVariable("id") Long id)

    {
        //rest魔板 发送get 请求
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);

    }



    @SuppressWarnings("unchecked")

    @RequestMapping(value="/consumer/dept/list")

    public List<Dept> list()

    {

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);

    }

}
