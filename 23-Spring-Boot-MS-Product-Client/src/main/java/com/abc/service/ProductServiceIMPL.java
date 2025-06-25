package com.abc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.abc.model.Product;
import com.abc.repository.ProductRepository;

@Service
public class ProductServiceIMPL implements ProductService {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public ResponseEntity<?> saveProduct(Product product) {
		return new ResponseEntity<Product>(productRepo.save(product), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getProduct(int pid) {
		if (productRepo.existsById(pid))
			return new ResponseEntity<Product>(productRepo.findById(pid).get(), HttpStatus.OK);
		else
			return new ResponseEntity<Product>(new Product(), HttpStatus.BAD_REQUEST);
	}

	@Override
	public ResponseEntity<?> getAllProduct() {

		return new ResponseEntity<List<Product>>(productRepo.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> deleteProduct(int pid) {
		if (productRepo.existsById(pid)) {
			productRepo.deleteById(pid);
			return new ResponseEntity<String>("Product Deleted", HttpStatus.OK);
		} else
			return new ResponseEntity<String>("Product Not found", HttpStatus.BAD_REQUEST);
	}

	@Override
	public ResponseEntity<?> updateProduct(Product product) {
		if (productRepo.existsById(product.getPid())) {
			return new ResponseEntity<Product>(productRepo.save(product), HttpStatus.ACCEPTED);
		} else
			return new ResponseEntity<Product>(new Product(), HttpStatus.BAD_REQUEST);
	}

}
