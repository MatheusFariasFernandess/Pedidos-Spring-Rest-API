package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Product;
import com.example.demo.services.ProductService;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @PostMapping
    public void Product(@RequestBody Product Product){
        productService.saveProduct(Product);
    }  

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Product Product = productService.findById(id);
        return ResponseEntity.ok().body(Product);
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){    
        List<Product> Products = productService.findAll();
        return ResponseEntity.ok().body(Products);
    }
}

