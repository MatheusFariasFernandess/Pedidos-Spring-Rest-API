package com.example.demo.models;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.models.modelsPK.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private static final Long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK id;

    private Integer quantity;

    private Double price;

    private Double totalPrice;

    public OrderItem(){}
    
    @Autowired
    public OrderItem(Order order,Product product,Integer quantity,Double price){
        this.quantity=quantity;
        this.price=price;
        id.setOrder(order);
        id.setProduct(product);
    }

    public Order getOrder(){
        return id.getOrder();
    }

    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }

    /**
     * @return Integer return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    /**
     * @return Double return the price
     */
    public Double getPrice() {
        
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    public void setTotalPayment(TransportCompanyMail transportCompanyMail){
        transportCompanyMail = new TransportCompanyMail();
        this.totalPrice = (quantity * price)+ transportCompanyMail.frete();   
    }

    public double getTotalPayment(){
        return this.totalPrice;
    }
}
