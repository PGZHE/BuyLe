package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//在调用微服务的时候就能去加载我们的自定义Ribbon负载策略类
//@RibbonClient(name="MICROSERVICE-DEPT",configuration=MyRule.class)
@EnableFeignClients
public class DeptConsumer80_App {
	public static void main(String[] args) {
		//我们在这里加了一个注释
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
