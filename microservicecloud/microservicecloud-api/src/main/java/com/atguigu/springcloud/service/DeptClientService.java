package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
//feign 的客户端
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)//微服务的 名
//fallbackFactory  hystrix错误返回机制
public interface DeptClientService

{

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)

    public Dept get(@PathVariable("id") long id);



    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)

    public List<Dept> list();



    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)

    public boolean add(Dept dept);

}