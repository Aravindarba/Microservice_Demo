package com.example.shoppingcart_service.controller;

import com.example.shoppingcart_service.model.Product;
import com.example.shoppingcart_service.model.ShoppingCartRequest;
import com.example.shoppingcart_service.model.ShoppingCartResponse;
import com.example.shoppingcart_service.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Instanceof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashSet;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/{userId}/products")
    public ResponseEntity addProductsToCart(
            @PathVariable Long userId,
            @RequestBody List<ShoppingCartRequest> reqProductList
    ) {
        ShoppingCartResponse response = shoppingCartService.processAddRequest(userId, reqProductList);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity getShoppingCart(@PathVariable Long userId) {
        return ResponseEntity.ok(shoppingCartService.getShoppingCart(userId));
    }

    @GetMapping("/")
    public String getName() {
        String val = "bala";
       //        Product productJson = Product.builder().productName("bala").productId(123L).amount(2323.0).build();
//        System.out.println(productJson);
        return "Hello";
    }
}






