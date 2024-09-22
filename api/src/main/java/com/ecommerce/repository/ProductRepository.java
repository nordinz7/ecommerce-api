package com.ecommerce.repository;

import com.ecommerce.model.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
  // This class will be implemented by Spring Data JPA
  // We don't need to write any code here

}
