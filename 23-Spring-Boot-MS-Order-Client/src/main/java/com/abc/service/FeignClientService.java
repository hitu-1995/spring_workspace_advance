package com.abc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.abc.model.Product;

// Feign client automatically manages load balance
@FeignClient(name = "PRODUCT-SERVICE/api/product")
public interface FeignClientService {

	@PostMapping("/")
	public ResponseEntity<?> saveProduct(@RequestBody Product product);
	
	@GetMapping("/{pid}")
	public ResponseEntity<?> getProduct(@PathVariable int pid);
	
	@DeleteMapping("/{pid}")
	public ResponseEntity<?> deleteProduct(@PathVariable int pid);
	
	@PutMapping("/")
	public ResponseEntity<?> updateProduct(@RequestBody Product product);
	
	@GetMapping("/")
	public ResponseEntity<?> getAllProduct();
}
