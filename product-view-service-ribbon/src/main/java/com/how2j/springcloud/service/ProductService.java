package com.how2j.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2j.springcloud.client.ProductClientRibbon;
import com.how2j.springcloud.pojo.Product;

@Service
public class ProductService {

	@Autowired
	private ProductClientRibbon productClientRibbon;
	
	public List<Product> getProducts() {
		return productClientRibbon.getProducts();
	}
}
