package com.example.demo.models;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.models.modelsPK.OrderItemPK;
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

    public OrderItem(){}
    
    public OrderItem(Order order,Product product,Integer quantity,Double price){
        this.quantity=quantity;
        this.price=price;
        id.setOrder(order);
        id.setProduct(product);
    }

    @Autowired
    public Order getOrder(){
        return id.getOrder();
    }

    @Autowired
    public void setOrder(Order order){
        id.setOrder(order);
    }

    @Autowired
    public Product getProduct(){
        return id.getProduct();
    }

    @Autowired
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

}
