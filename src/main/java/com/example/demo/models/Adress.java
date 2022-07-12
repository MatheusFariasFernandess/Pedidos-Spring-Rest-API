package com.example.demo.models;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Adress implements Serializable{
    
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    private Long homeNumber;

    private String streetName;

    public Adress(){}    

    public Adress(Long homeNumber,String streetName){
        this.homeNumber=homeNumber;
        this.streetName=streetName;
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
    public String getStreeName() {
        return streetName;
    }

    /**
     * @param streetName the streetName to set
     */
    public void setStreeName(String streetName) {
        this.streetName = streetName;
    }

}
