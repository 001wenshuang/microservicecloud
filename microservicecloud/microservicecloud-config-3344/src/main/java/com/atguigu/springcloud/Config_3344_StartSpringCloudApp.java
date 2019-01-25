package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud
 * @date 2019/1/17
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigServer //启用分布式配置中心
public class Config_3344_StartSpringCloudApp {

    public static void main(String[] args)

    {

        SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);

    }
}
