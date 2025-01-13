package org.example.productapi1.service;

import jakarta.transaction.Transactional;
import org.example.productapi1.entities.ProductEntity;
import org.example.productapi1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional

    public List<ProductEntity> getProductByType(String type) {
        return productRepository.findByType(type);
    }
    @Transactional
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

}

