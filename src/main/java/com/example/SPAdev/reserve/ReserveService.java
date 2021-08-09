package com.example.SPAdev.reserve;

import java.time.LocalDate;

public interface ReserveService {
    Long save(ReserveDTO reserveDTO);

    default Reserve dtoToEntity(ReserveDTO dto){
        Reserve reserve = Reserve.builder()
                .id(dto.getId())
                .name(dto.getName())
                .phoneNumber(dto.getPhoneNumber())
                .checkInDate(dto.getCheckInDate())
                .checkOutDate(dto.getCheckOutDate())
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
                .build();

        return reserveDTO;
    }

    void modifyReserve(ReserveDTO reserveDTO);
    Reserve findReserveByName(String name);
    Reserve findReserveByPhoneNumber(String phoneNumber);
    ReserveDTO getReserveById(Long id);
    ReserveDTO getReserveByPhoneNumber(String phoneNumber);

}
