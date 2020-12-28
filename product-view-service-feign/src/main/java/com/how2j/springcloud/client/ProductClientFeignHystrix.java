package com.how2j.springcloud.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.how2j.springcloud.pojo.Product;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign {

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "产品数据微服务不可用", 0));
		return products;
	}

}
