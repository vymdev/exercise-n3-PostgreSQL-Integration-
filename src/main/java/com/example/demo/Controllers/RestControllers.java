package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DatabaseRepository;

@RestController
public class RestControllers {
    
    private DatabaseRepository repository;

    @Autowired
    public RestControllers(DatabaseRepository repository) {
        this.repository = repository;
    }
    
}
