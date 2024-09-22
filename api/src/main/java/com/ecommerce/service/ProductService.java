package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;

public class ProductService {
  public ProductRepository productRepository;

  public Product getById(Long id) {
    return productRepository.findById(id).orElse(null);
  }

  public List<Product> getAll() {
    List<Product> products = new ArrayList<>();
    productRepository.findAll().forEach(products::add);
    return products;
  }

  public Product create(Product product) {
    return productRepository.save(product);
  }

  public Product update(Long id, Product productDetails) {
    Product product = productRepository.findById(id).orElse(null);
    if (product != null) {
      product.setName(productDetails.getName());
      product.setDescription(productDetails.getDescription());
      product.setPrice(productDetails.getPrice());
      product.setQuantity(productDetails.getQuantity());
      return productRepository.save(product);
    } else {
      return null;
    }
  }

  public boolean delete(Long id) {
    Product product = productRepository.findById(id).orElse(null);
    if (product != null) {
      productRepository.delete(product);
      return true;
    } else {
      return false;
    }
  }

}