package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Product;
import com.abc.service.ProductServiceIMPL;

@RestController
@RequestMapping("/product-service")
public class HomeController {

	@Autowired
	private ProductServiceIMPL serviceIMPL;

	@RequestMapping("/{pageNo}")
	public Page<Product>  getProducts(@PathVariable int pageNo) {
		
		return serviceIMPL.check(pageNo);
	}
}

