package com.example.SPAdev.reserve;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
class ReserveServiceTest {

    ReserveService reserveService;

    @Test
    @Rollback
    public void test() throws Exception{
        IntStream.rangeClosed(1,30).forEach(i ->{
            ReserveDTO reserveDTO = new ReserveDTO();
            reserveDTO.setName("test"+i);
            reserveDTO.setPhoneNumber("123"+i+"111");
            Long id = reserveService.save(reserveDTO);
            System.out.println("id = " + id);
        });



        List<ReserveDTO> result = reserveService.getListAll();
        //when
        for (ReserveDTO reserveDTO : result) {
            System.out.println("reserveDTO.getName() = " + reserveDTO.getName());
            System.out.println("reserveDTO.getName() = " + reserveDTO.getPhoneNumber());
            System.out.println("reserveDTO.getName() = " + reserveDTO.getStatus());
        }
        //then
    }

}