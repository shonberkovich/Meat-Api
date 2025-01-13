package org.example.productapi1.controler;

import org.example.productapi1.entities.ProductEntity;
import org.example.productapi1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;

@RestController
@RequestMapping("products/")

public class ProductControler {
    @Autowired
    private ProductService productService;


    @GetMapping("/get-products-byType/{type}")
    public List<ProductEntity> getProductByType(@PathVariable String type) {
        return productService.getProductByType(type);
    }

    @GetMapping("/get-all-products")
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }
}


