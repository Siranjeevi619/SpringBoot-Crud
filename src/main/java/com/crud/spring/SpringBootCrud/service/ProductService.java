package com.crud.spring.SpringBootCrud.service;

import com.crud.spring.SpringBootCrud.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> Products = Arrays.asList(new Product(1, "ponniyan selvan", 4000),
            new Product(7, "The Alchemist", 400), new Product(99, "Harry Potter Franchise", 10000));
    public List<Product> getProducts() {
        return Products;
    }
}
