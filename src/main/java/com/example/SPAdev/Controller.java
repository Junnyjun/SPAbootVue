package com.example.SPAdev;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
