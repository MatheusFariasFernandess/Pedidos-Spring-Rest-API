package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Product;
import com.example.demo.models.Product;
import com.example.demo.repository.ProcutRepositoy;
import com.example.demo.repository.ProcutRepositoy;

@Service
public class ProductService {

    @Autowired
    ProcutRepositoy productRepository;

    public List<Product>findAll(){
        return productRepository.findAll();
    }

    public void saveProduct(Product Product){
        productRepository.save(Product);
    }

    public Product findById(Long id){
        Optional<Product> Product = productRepository.findById(id);
        return Product.get(); 
    } 
}
