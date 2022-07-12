package com.example.demo.services;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.OrderItem;
import com.example.demo.repository.OderItemRepository;

@Service
public class OrdeItemService {

    @Autowired
    private OderItemRepository oderItemRepository;

    public List<OrderItem> findAll(){
        return oderItemRepository.findAll();
    }

    public OrderItem findById(Long id){
        Optional<OrderItem> orderItem = oderItemRepository.findById(id);
        return orderItem.get();
    }

    public void save(OrderItem orderItem){
         oderItemRepository.save(orderItem);
    }
}
