package com.example.demo.models.modelsPK;

import java.io.Serializable;

import com.example.demo.models.Order;
import com.example.demo.models.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable{
     
    @ManyToOne
    @JoinColumn(name = "order_id")
     private Order order;

     @ManyToOne
     @JoinColumn(name = "product_id")
     private Product product;  

    /**
     * @return Order return the order
     */
    
    public Order getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * @return Product return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

}
