package com.example.ecommerceapi.repository;

import com.example.ecommerceapi.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    public List<Product> findByType(String productType);
}
