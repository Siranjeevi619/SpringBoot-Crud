package com.crud.spring.SpringBootCrud.Controller;


import com.crud.spring.SpringBootCrud.model.Product;
import com.crud.spring.SpringBootCrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    ProductService ProductService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return ProductService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        return ProductService.getProductById(id);
    }



}
