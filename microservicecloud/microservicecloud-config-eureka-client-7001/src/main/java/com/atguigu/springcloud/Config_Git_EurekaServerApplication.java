package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud
 * @date 2019/1/17
 */


@SpringBootApplication

@EnableEurekaServer //config  需要启用eureka 服务
public class Config_Git_EurekaServerApplication

{

    public static void main(String[] args)

    {

        SpringApplication.run(Config_Git_EurekaServerApplication.class, args);

    }

}
