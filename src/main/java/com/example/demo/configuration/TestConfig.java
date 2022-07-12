package com.example.demo.configuration;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Adress;
import com.example.demo.models.Order;
import com.example.demo.models.OrderItem;
import com.example.demo.models.Product;
import com.example.demo.models.User;
import com.example.demo.repository.ProcutRepositoy;
import com.example.demo.services.AdressService;
import com.example.demo.services.OrdeItemService;
import com.example.demo.services.OrderService;
import com.example.demo.services.ProductService;
import com.example.demo.services.UserService;


@Configuration
public class TestConfig implements CommandLineRunner {
   
    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrdeItemService orderItemService; 
    // @Autowired
    // private AdressService adressService;
    
    @Override
    public void run(String... args) throws Exception {
        List<Adress> adresses = new ArrayList<Adress>();
        adresses.add(new Adress(148L,"Groove Street"));
        User user = new User(1L,"matheus","@hotmail.com","9898223","147852",adresses);
        Order order = new Order(1L,Instant.now(),user);
        Product product=  new Product(2L,"GTX980","MUITO BOA",980.88); 
        
        // adressService.saveAll(adresses);
        userService.saveUser(user); 
        orderService.save(order);
        productService.saveProduct(product);
       
        // OrderItem orderItem = new OrderItem(order,product,50,product.getPrice());

        // orderItemService.save(orderItem);

    }
    
}
