package com.example.demo.models;

import org.springframework.stereotype.Service;

import com.example.demo.interfaces.PaymentType;

@Service
public  class PaymentPix implements PaymentType {

    @Override
    public double taxService(double productPrice) {
        double taxaPix = 10; 
        return taxaPix+ productPrice;
    }
    
}
