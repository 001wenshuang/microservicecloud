package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud.cfgbeans
 * @date 2019/1/17
 * 这个对象 相当于spring mvc 中的applicationcontext.xml 写入得注入的bean spring 创建
 * 对象的容器
 */


@Configuration

public class ConfigBean

{

    @Bean
    @LoadBalanced  //启用 ribbon 负载均衡
    public RestTemplate getRestTemplate()

    {
//创建rest 风格访问的魔板对象
        return new RestTemplate();

    }

//    public IRule  myRule(){
//
//        return  new IRule();
//    }

}
