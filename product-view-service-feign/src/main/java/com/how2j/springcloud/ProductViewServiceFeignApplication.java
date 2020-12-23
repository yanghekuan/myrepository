package com.how2j.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient //表示这是个 Eureka客户端
@EnableDiscoveryClient //表示用于发现eureka 注册中心的微服务
@EnableFeignClients //表示用于使用 Feign 方式
public class ProductViewServiceFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductViewServiceFeignApplication.class, args);
    }
    
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
