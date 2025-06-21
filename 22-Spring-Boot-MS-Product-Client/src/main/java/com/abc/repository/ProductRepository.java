package com.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
