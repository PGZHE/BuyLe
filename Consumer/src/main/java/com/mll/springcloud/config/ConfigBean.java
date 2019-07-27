/*
package com.mll.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //Riboon是基于Netfix Ribbon实现的一套客户端负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //使用自定义负载均衡(只能一次实现一种策略)
    @Bean
    public IRule getRule(){
        return new RoundRobinRule();//轮询
        //return new RandomRule();//随机
        //return new RetryRule();//重试(碰到下线或者服务断开)
    }
}
*/
