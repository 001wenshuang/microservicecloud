package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud
 * @date 2019/1/17
 */


@SpringBootApplication
@EnableEurekaClient //eureka客户端  eureka 获取微服务提供者
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"}  )
//@ComponentScan("com.atguigu.springcloud")
public class DeptConsumer80_Feign_App

{

    public static void main(String[] args)

    {

        SpringApplication.run(DeptConsumer80_Feign_App.class, args);

    }

}
