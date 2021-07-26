package com.example.SPAdev.config;

import com.example.SPAdev.reserve.ReserveDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class DefaultController {

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("reserveDTO", new ReserveDTO());
        log.info("");

        return "index";
    }

}
