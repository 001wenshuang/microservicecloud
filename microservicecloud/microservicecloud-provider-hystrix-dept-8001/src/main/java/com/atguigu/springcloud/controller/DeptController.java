package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud.controller
 * @date 2019/1/17
 */

@RestController
public class DeptController {

    @Autowired

    private DeptService service;


    @Autowired

    private DiscoveryClient client; //服务发现  发现 查询 注册进eureka 中的服务信息的对象

    /** 
    * @Description:
    * @Param:  
    * @return:  
    * @Author: wilsonwen 文爽
    * @Date: 2019/1/21 
    * @desc 说明:
    */

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)

    public boolean add(@RequestBody Dept dept) {

        return service.add(dept);

    }


    /**
     * @param id
     * @return
     */
    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)

    @HystrixCommand(fallbackMethod = "processHystrix_Get") //hystrix 发生错误的时候抛 服务熔断 及时返回错误信息
    //执行 processHystrix_Get 错误方法

    public Dept get(@PathVariable("id") Long id)

    {

        Dept dept =  this.service.get(id);

        if(null == dept)

        {

            throw new RuntimeException("该ID："+id+"没有没有对应的信息");//发生错误的时候histrix服务熔断

        }

        return dept;

    }



    /** 
    * @Description: hystrix 熔断 的错误信息返回
    * @Param:  
    * @return:  
    * @Author: wilsonwen 文爽
    * @Date: 2019/1/24 
    * @desc 说明:
    */
    public Dept processHystrix_Get(@PathVariable("id") Long id)

    {

//        return new Dept().setDeptno(id)
//
//                .setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
//
//                .setDb_source("no this database in MySQL");
        return new Dept(id,"该ID："+id+"没有没有对应的信息,null--@HystrixCommand","no this database in MySQL");

    }


    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)

    public List<Dept> list() {

        return service.list();

    }





 /**
 * @Description:
 * @Param:
 * @return:
 * @Author: wilsonwen 文爽
 * @Date: 2019/1/21
 * @desc 说明:从eureka 注册中心 获取 到注册的服务的 信息
 */
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)

    public Object discovery()

    {

   

        List<String> list = client.getServices();

        System.out.println("**********" + list);



        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");

        for (ServiceInstance element : srvList) {

            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"

                    + element.getUri());

        }

        return this.client;

    }

}
