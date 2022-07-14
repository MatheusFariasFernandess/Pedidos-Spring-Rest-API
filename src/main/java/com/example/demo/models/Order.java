package com.example.demo.models;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;


import com.example.demo.models.DTO.UserDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_order")
public class Order implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;   
    private Instant moment;

    
    @ManyToOne
    @JoinColumn(name="client_id")
    private User client;
    
    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem>orderItem = new HashSet<OrderItem>();

    public Order(){}

    public Order(Long id, Instant moment, User client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
    }
    
    
        public UserDTO getCliente() {
            UserDTO userDTO= new UserDTO(client);
            return userDTO;
        }

    public Long getid() {
        return this.id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return this.moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public void setCliente(User client) {
        this.client = client;
    }
    
    public Set<OrderItem> getOrderItem(){
        return orderItem;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return this.id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    

    


}
