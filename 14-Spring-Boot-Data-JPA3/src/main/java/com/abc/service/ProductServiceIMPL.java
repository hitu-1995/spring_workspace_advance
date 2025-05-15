package com.abc.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.abc.model.Product;
import com.abc.repository.ProductRepository;

@Service
public class ProductServiceIMPL {

	@Autowired
	private ProductRepository productRepository;

	public void sortingexamples() {

		Sort sort = Sort.by("category").ascending().and(Sort.by("brand").descending());
		Iterable<Product> list = productRepository.findAll(sort);
		list.forEach(prod -> System.out.println(prod));

	}

	private void sortByCategory() {
		Sort sort = Sort.by("category").descending();
		Iterable<Product> list = productRepository.findAll(sort);
		list.forEach(prod -> System.out.println(prod));
	}

	public Page<Product> check(int pageNo) {

		Pageable pageable = PageRequest.of(pageNo, 2);
		Page<Product> page = productRepository.findAll(pageable);
		page.forEach(product -> System.out.println(product));

		return page;
	}

	@PostConstruct
	public void insertRecord() {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(101, "Mobile", "Apple", 80000, "Electronics"));
		list.add(new Product(102, "TV", "Samsung", 60000, "Electronics"));
		list.add(new Product(103, "Mobile", "Samsung", 20000, "Electronics"));
		list.add(new Product(104, "TV", "Sony", 30000, "Electronics"));
		list.add(new Product(105, "Tshirt", "Nike", 600, "Clothing"));
		list.add(new Product(106, "Pant", "Allen Soly", 900, "Clothing"));
		list.add(new Product(107, "Laptop", "Asus", 30900, "Electronics"));
		list.add(new Product(108, "Shirt", "Buffello", 900, "Clothing"));
		
		productRepository.saveAll(list);
	}

}
