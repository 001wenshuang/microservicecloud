package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud
 * @date 2019/1/17
 */


@SpringBootApplication
@EnableHystrixDashboard //HystrixDashboard 启用监控模块
public class DeptConsumer_DashBoard_App

{

    public static void main(String[] args)

    {

        SpringApplication.run(DeptConsumer_DashBoard_App.class, args);

    }

}
