package com.example.demo.configuration;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Order;
import com.example.demo.models.Product;
import com.example.demo.models.User;
import com.example.demo.repository.ProcutRepositoy;
import com.example.demo.services.OrderService;
import com.example.demo.services.ProductService;
import com.example.demo.services.UserService;

@Configuration
public class TestConfig implements CommandLineRunner {
    @Autowired
    private ProcutRepositoy productRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;
    
    @Override
    public void run(String... args) throws Exception {
        User user = new User(null,"KIDFA","@hotmail.com","9898223","147852");
        Order order = new Order(null,Instant.now(),user);
        Product product=  new Product(null,"GTX980","MUITO BOA",980.88); 

        userService.saveUser(user); 
        orderService.save(order);
        productService.saveProduct(product);
    }
    
}
