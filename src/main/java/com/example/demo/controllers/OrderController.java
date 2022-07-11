package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Order;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    
    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity findAll(){
        List<Order> order = orderService.findAll();
        return ResponseEntity.ok().body(order); 
    }

    @GetMapping(value = "/{id}")
     public ResponseEntity findById(@PathVariable Long id){
         Order order = orderService.findById(id);
         return ResponseEntity.ok().body(order);
     }

     @PostMapping
     public void save(@RequestBody Order order){
        orderService.save(order);
     }


}
