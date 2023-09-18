package com.example.ecommerceapi.service.impl;

import com.example.ecommerceapi.entity.Product;
import com.example.ecommerceapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl {

    @Autowired
    private ProductRepository _productRepository;



}
