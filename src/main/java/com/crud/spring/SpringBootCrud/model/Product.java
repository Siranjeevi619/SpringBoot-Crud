package com.crud.spring.SpringBootCrud.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//@Component
@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;
}
