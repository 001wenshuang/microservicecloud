package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud
 * @date 2019/1/17
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableZuulProxy  //启用路由
public class Zuul_9527_StartSpringCloudApp {

    public static void main(String[] args)

    {

        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);

    }
}
