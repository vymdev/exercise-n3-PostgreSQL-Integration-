package com.example.demo.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Database;
import com.example.demo.DatabaseRepository;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/products")
public class RestControllers {
    
    private DatabaseRepository repository;

    @Autowired
    public RestControllers(DatabaseRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<?> addProduct(@Valid @RequestBody DatabaseDTO entity) {
        Database db = new Database();
        db.setProduct(entity.getProduct());
        db.setValue(entity.getValue());
        repository.save(db);
        return ResponseEntity.ok("product saved!");
    }
    
    @GetMapping
    public ResponseEntity<List<Database>> viewAllProducts() {
        return ResponseEntity.ok(repository.findAll());
    }
    
}
