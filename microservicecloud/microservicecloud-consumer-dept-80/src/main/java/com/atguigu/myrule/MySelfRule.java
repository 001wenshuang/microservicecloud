package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.myrule
 * @date 2019/1/23
 */


@Configuration

public class MySelfRule

{

    @Bean

    public IRule myRule()//选择 ribbon 的算法的

    {
        //默认的 有7 种 算法
//     return   new RoundRobinRule();// 轮询算法
//        return new RandomRule();//Ribbon默认是轮询，我自定义为随机

        return new RandomRule_ZY();//我自定义为每个机器被访问5次
    }

}
