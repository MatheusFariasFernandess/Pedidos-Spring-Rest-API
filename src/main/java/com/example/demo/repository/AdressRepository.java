package com.example.demo.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress,Long> {
    
}
