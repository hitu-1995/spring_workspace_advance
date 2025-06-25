package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Product;
import com.abc.service.FeignClientService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	private FeignClientService service;
	
	@PostMapping("/")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {

		return service.saveProduct(product);
	}
	@GetMapping("/{pid}")
	public ResponseEntity<?> getProduct(@PathVariable int pid) {

		return service.getProduct(pid);
	}
	@GetMapping("/")
	public ResponseEntity<?> getAllProduct() {
		return service.getAllProduct();
	}
	
	// implement delete api for product
	
	
	// implement update api for product
	
}
