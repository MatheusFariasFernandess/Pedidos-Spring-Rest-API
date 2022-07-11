package com.example.demo.models.DTO;



import java.io.Serializable;

import com.example.demo.models.User;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDTO implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    public UserDTO(){}
    
    public UserDTO(User user){
         user.setId(id);
         user.setUsername(username);   
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

    /**
     * @return String return the username
     */
    public String getName() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setName(String username) {
        this.username = username;
    }

}
