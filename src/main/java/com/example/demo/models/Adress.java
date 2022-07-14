package com.example.demo.models;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Adress implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    private String city;

    private Long homeNumber;

    private String streetName;

    public Adress(){}    

    public Adress(String city,Long homeNumber,String streetName){
        this.city=city;    
        this.homeNumber=homeNumber;
        this.streetName=streetName;
    }

    


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    // /**
    //  * @return User return the userId
    //  */
    // public User getUserId() {
    //     return userId;
    // }

    // /**
    //  * @param userId the userId to set
    //  */
    // public void setUserId(User userId) {
    //     this.userId = userId;
    // }

    /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return Long return the homeNumber
     */
    public Long getHomeNumber() {
        return homeNumber;
    }

    /**
     * @param homeNumber the homeNumber to set
     */
    public void setHomeNumber(Long homeNumber) {
        this.homeNumber = homeNumber;
    }

    /**
     * @return String return the streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName the streetName to set
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

}
