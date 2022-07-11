package com.example.demo.services;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAll(){
         return orderRepository.findAll();   
    }
    
    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }

    public void save(Order order){
        orderRepository.save(order);
    }
}
