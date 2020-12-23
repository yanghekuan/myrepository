package com.how2j.springcloud.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.how2j.springcloud.pojo.Product;

@Component
public class ProductClientRibbon {

	@Autowired
	private RestTemplate restTemplate;
	
	public List<Product> getProducts() {
		return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/getProducts", List.class);
	}
}
