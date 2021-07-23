package com.example.SPAdev.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class DefaultController {

    @GetMapping("/")
    public String main(){
        log.info("");

        return "index";
    }

    @GetMapping("/info")
    public String info(){
        log.info("");

        return "info";
    }

    @GetMapping("/book")
    public String book(){
        log.info("");

        return "book";
    }

    @GetMapping("map")
    public String map(){
        log.info("");

        return "index";
    }

}
