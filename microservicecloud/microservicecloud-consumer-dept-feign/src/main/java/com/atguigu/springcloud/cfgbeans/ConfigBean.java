package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
//    Feign通过接口的方法调用Rest服务（之前是Ribbon+RestTemplate），
//
//    该请求发送给Eureka服务器（http://MICROSERVICECLOUD-DEPT/dept/list）,
//
//    通过Feign直接找到服务接口，由于在进行服务调用的时候融合了Ribbon技术，所以也支持负载均衡作用。

//Feign 自带 rest 和负载均衡
    //目前问题是怎样实现 自定义算法

    @Bean
    public IRule myRule(){
        //默认的 有7 种 算法
     return   new RoundRobinRule();// 轮询算法
//        return new RandomRule();//Ribbon默认是轮询，我自定义为随机
    }

}
