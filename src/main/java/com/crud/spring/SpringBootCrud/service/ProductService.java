package com.crud.spring.SpringBootCrud.service;

import com.crud.spring.SpringBootCrud.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    List<Product> Products = new ArrayList<>(Arrays.asList(new Product(2, "VICTUS FA0555TX", 74000),
            new Product(3, "Iphone 15", 50000), new Product(1, "Realme 6", 18500)));
    public List<Product> getProducts() {
        Collections.sort(Products,  new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        });
        return Products;
    }

    public Product getProductById(int productId){
        Product prod = null;
        boolean flag = false;
        for(Product p : Products ){
            if(p.getId() == productId){
                prod = p;
                flag = true;
                break;
            }
        }
        if(flag == false){
            prod = new Product(0, "Not Product Found" , 0 );
        }

        return prod;
    }

    public Product addProduct(Product product){
//        Products.(product);
        Products.add(product);
        System.out.println("Product Added Successfully");
        System.out.println(product.toString());
        return product;
    }

}
