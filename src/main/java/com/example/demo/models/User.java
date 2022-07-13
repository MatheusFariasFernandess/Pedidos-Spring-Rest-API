package com.example.demo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User implements Serializable{

    public static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    // @OneToOne(mappedBy = "userId")
    @OneToOne(cascade = {CascadeType.ALL})
    //  private List<Adress>adresses = new ArrayList<Adress>();
    @Autowired
    private Adress adresses;
    
    private String username;
    private String email;
    private String phone;
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<Order>();

    public User(){}

    public User(Long id, String username, String email, String phone, String password,Adress adresses) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.adresses=adresses;
        this.password = password;
        // this.adresses=adresses;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    // public List<Adress> getAdress(){
    //     return adresses;
    // }

    public Adress getAdress(){
        return adresses;
    }
    
}
