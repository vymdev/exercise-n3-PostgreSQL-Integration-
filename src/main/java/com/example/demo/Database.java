package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Database {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    
    private String product;
    private int value;

}
