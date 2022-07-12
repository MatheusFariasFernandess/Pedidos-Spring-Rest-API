package com.example.demo.models;

import org.springframework.stereotype.Service;

import com.example.demo.interfaces.PaymentType;

@Service
public class PaymentCreditCard implements PaymentType {

    @Override
    public double taxService(double productPrice) {
        double taxCreditCard = 25;
        return taxCreditCard + productPrice;
    }
    
}
