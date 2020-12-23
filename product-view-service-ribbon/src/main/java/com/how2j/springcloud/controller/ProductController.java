package com.how2j.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.how2j.springcloud.pojo.Product;
import com.how2j.springcloud.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/getProducts")
	public Object getProducts(ModelMap model) {
		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);
		return "products";
	}
}
