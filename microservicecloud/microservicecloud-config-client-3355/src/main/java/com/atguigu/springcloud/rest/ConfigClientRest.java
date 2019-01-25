package com.atguigu.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud.rest
 * @date 2019/1/24
 * 这个 类主要的功能就是 实验 能否读取到 github 上的配置
 */

@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")

    private String applicationName;



    @Value("${eureka.client.service-url.defaultZone}")

    private String eurekaServers;



    @Value("${server.port}")

    private String port;



    @RequestMapping("/config")

    public String getConfig()

    {

        String str = "applicationName: "+applicationName+"\t eurekaServers:"+eurekaServers+"\t port: "+port;

        System.out.println("******str: "+ str);

        return "applicationName: "+applicationName+"\t eurekaServers:"+eurekaServers+"\t port: "+port;

    }
}
