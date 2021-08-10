package com.example.SPAdev.reserve;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {
    @Transactional(readOnly = true)
    Reserve findReserveByName(String name);
    @Transactional(readOnly = true)
    Reserve findReserveByPhoneNumber(String  phoneNumber);
    @Transactional(readOnly = true)
    Reserve findReserveById(Long id);


}
