package com.example.SPAdev.config;

import com.example.SPAdev.reserve.Reserve;
import com.example.SPAdev.reserve.ReserveDTO;
import com.example.SPAdev.reserve.ReserveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SecurityController {

    private final ReserveRepository reserveRepository;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/manager")
    public void managerPage(){
        List<Reserve> getList = reserveRepository.findAll();

    }
}
