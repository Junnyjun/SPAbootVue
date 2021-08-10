package com.example.SPAdev.reserve;

import java.time.LocalDate;
import java.util.List;

public interface ReserveService {
    Long save(ReserveDTO reserveDTO);



    void modifyReserve(ReserveDTO reserveDTO);
    Reserve findReserveByName(String name);
    Reserve findReserveByPhoneNumber(String phoneNumber);
    ReserveDTO getReserveById(Long id);
    ReserveDTO getReserveByPhoneNumber(String phoneNumber);

    List<ReserveDTO> getListAll();










    default Reserve dtoToEntity(ReserveDTO dto){
        Reserve reserve = Reserve.builder()
                .id(dto.getId())
                .name(dto.getName())
                .phoneNumber(dto.getPhoneNumber())
                .checkInDate(dto.getCheckInDate())
                .checkOutDate(dto.getCheckOutDate())
                .status(dto.getStatus())
                .build();

        return reserve;
    }

    default ReserveDTO entityToDto(Reserve dto) {
        ReserveDTO reserveDTO = ReserveDTO.builder()
                .id(dto.getId())
                .name(dto.getName())
                .phoneNumber(dto.getPhoneNumber())
                .checkInDate(dto.getCheckInDate())
                .checkOutDate(dto.getCheckOutDate())
                .status(dto.getStatus())
                .build();

        return reserveDTO;
    }
}
