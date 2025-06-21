package com.abc.service;

import org.springframework.http.ResponseEntity;

import com.abc.model.Product;

public interface ProductService {

	 ResponseEntity<?> saveProduct(Product product);
	 
	 ResponseEntity<?> getProduct(int pid);
	 
	 ResponseEntity<?> getAllProduct();
	 
	 ResponseEntity<?> deleteProduct(int pid);
	 
	 ResponseEntity<?> updateProduct(Product product);
	 
}
