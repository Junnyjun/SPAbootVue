package com.example.SPAdev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
