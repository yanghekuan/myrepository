package com.how2j.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 启用网关代理
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceZuulApplication.class, args);
	}
}
