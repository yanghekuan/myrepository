package com.how2j.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.how2j.springcloud.pojo.Product;
import com.how2j.springcloud.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/getProducts")
	public List<Product> getProducts() {
		return productService.listProducts();
	}
}
