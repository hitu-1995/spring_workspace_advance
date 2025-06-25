package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Product;
import com.abc.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("/{pid}")
	public ResponseEntity<?> getProduct(@PathVariable int pid) {
		return productService.getProduct(pid);
	}
	@GetMapping("/")
	public ResponseEntity<?> getAllProduct() {
		return productService.getAllProduct();
	}
	@DeleteMapping("/{pid}")
	public ResponseEntity<?> deleteProduct(@PathVariable int pid) {
		return productService.deleteProduct(pid);
	}
	@PutMapping("/")
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
}
