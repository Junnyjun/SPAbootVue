package com.example.SPAdev;

import com.example.SPAdev.reserve.Reserve;
import com.example.SPAdev.reserve.ReserveDTO;
import com.example.SPAdev.reserve.ReserveRepository;
import com.example.SPAdev.reserve.ReserveService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class reserveTest {

    @Autowired
    ReserveService reserveService;

    @Autowired
    ReserveRepository reserveRepository;

    @Test
    public void save() throws Exception {
        ReserveDTO reserveDTO = ReserveDTO.builder()
                .name("asd1255")
                .phoneNumber("12300005555")
                .build();
        reserveService.save(reserveDTO);
    }

    @Test
    public void findReserveByName() throws Exception {
        String name = "test123";

        reserveService.findReserveByName(name);
    }

    @Test
    public void findReserveById() throws Exception {
        String phoneNumber = "0000";

        reserveService.findReserveByPhoneNumber(phoneNumber);
    }

    //망함
    @Test
    public void modifyReserve() throws Exception{
        String str = "6";
        Long id = Long.parseLong(str);

        ReserveDTO reserveDTO = reserveService.getReserveById(id);
        System.out.println("ReserveDTO 값 : " + reserveDTO);
        reserveDTO.setPhoneNumber("1234");
        reserveDTO.setName("홍길동");


        reserveService.modifyReserve(reserveDTO);
    }






}
