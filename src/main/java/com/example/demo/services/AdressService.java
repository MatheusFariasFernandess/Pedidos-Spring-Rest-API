package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import com.example.demo.models.Adress;
import com.example.demo.repository.AdressRepository;

@Service
public class AdressService {
        @Autowired
        AdressRepository adressService;

    public void save(Adress adress){
        adressService.save(adress);
    }

    public void saveAll(List<Adress> adress){
        adressService.saveAll(adress);
    }
}
