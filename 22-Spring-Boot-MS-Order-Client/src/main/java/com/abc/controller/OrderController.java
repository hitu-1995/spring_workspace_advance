package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.abc.model.Product;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		// we have to send this product object to api/product
		 //restTemplate.postForObject("", product, Product.class);
		return restTemplate.postForEntity("http://localhost:9090/api/product/", product, Product.class);
	}
	@GetMapping("/{pid}")
	public ResponseEntity<?> getProduct(@PathVariable int pid) {

		return restTemplate.getForEntity("http://localhost:9090/api/product/"+pid, Product.class);
	}
	@GetMapping("/")
	public ResponseEntity<?> getAllProduct() {
		return restTemplate.getForEntity("http://localhost:9090/api/product/",List.class);
	}
	
	// implement delete api for product
	
	
	// implement update api for product
	
}
