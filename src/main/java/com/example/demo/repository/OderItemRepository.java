package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.OrderItem;
import com.example.demo.models.modelsPK.OrderItemPK;

@Repository
public interface OderItemRepository extends JpaRepository<OrderItem,Long> {
    
}
