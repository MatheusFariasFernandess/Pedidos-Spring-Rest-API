package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TransportCompanyShipping {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;        

        private String name;

        public TransportCompanyShipping(){}

        public TransportCompanyShipping(Long id,String name){
            this.id=id;
            this.name=name;
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
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public double frete(){
        return 165;
    }
}
