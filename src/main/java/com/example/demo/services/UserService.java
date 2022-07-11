package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User>findAll(){
        return userRepository.findAll();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.get(); 
    } 
}
