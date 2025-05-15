package com.abc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.abc.model.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer>{

}
