package com.example.product_service.controller;


import com.example.product_service.entity.Product;
import com.example.product_service.service.ProductService;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    // @Value("${product.message}")
    String message = "Hello";

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> productList){
        return productService.addProducts(productList);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        System.out.println("Message from repo -> "+message);
        return productService.getProducts();
    }

    @GetMapping("/getProducts/{productIdsList}")
    public List<Product> getProductsByIds(@PathVariable List<Long> productIdsList){
        return productService.getProductsByIds(productIdsList);
    }
}
