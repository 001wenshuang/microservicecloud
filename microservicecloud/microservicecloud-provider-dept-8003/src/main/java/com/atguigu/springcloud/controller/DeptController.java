package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
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
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)

    public Dept get(@PathVariable("id") Long id) {

        return service.get(id);

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
