package com.crud.spring.SpringBootCrud.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String Greet(){
        return "Hello Dev!!!";
    }
}
