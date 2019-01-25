package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud
 * @date 2019/1/17
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现  发现 查询 注册进eureka 中的服务信息的注解
@MapperScan(basePackages = "com.atguigu.springcloud.dao") //扫描dao 层
public class DeptProvider8001_App {

    public static void main(String[] args)

    {

        SpringApplication.run(DeptProvider8001_App.class, args);

    }
}
