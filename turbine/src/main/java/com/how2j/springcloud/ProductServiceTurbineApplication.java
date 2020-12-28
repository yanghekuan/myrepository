package com.how2j.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableTurbine // 开启断路器聚合监控
public class ProductServiceTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceTurbineApplication.class, args);
	}
}
