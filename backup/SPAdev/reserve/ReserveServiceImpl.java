package com.example.SPAdev.reserve;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;

@Service
@RequiredArgsConstructor
public class ReserveServiceImpl implements ReserveService {

    @Autowired
    private final ReserveRepository reserveRepository;

    @Override
    public Long save(ReserveDTO reserveDTO) {
        Reserve reserve = dtoToEntity(reserveDTO);
        reserveRepository.save(reserve);

        return reserve.getId();

    }

    @Override
    public void modifyReserve(ReserveDTO reserveDTO) {
        Reserve result = reserveRepository.getById(reserveDTO.getId());
        result.changeName(reserveDTO.getName());
        result.changePhoneNumber(reserveDTO.getPhoneNumber());
        result.changeCheckInDate(reserveDTO.getCheckInDate());
        result.changeCheckOutDate(reserveDTO.getCheckOutDate());
        reserveRepository.save(result);
    }

    @Override
    public Reserve findReserveByName(String name) {
        Reserve reserve = reserveRepository.findReserveByName(name);

        if (reserve == null) {
            new NullPointerException("Null reserve");
        }

        return reserve;
    }

    @Override
    public Reserve findReserveByPhoneNumber(String phoneNumber) {
        Reserve reserve = reserveRepository.findReserveByPhoneNumber(phoneNumber);

        if (reserve == null) {
            new NullPointerException("Null reserve");
        }

        return reserve;
    }

    @Override
    public ReserveDTO getReserveById(Long id) {

        Reserve reserve = reserveRepository.getById(id);
        ReserveDTO reserveDTO = entityToDto(reserve);
        return reserveDTO;
    }

    @Override
    public ReserveDTO getReserveByPhoneNumber(String phoneNumber) {

        Reserve reserve = reserveRepository.findReserveByPhoneNumber(phoneNumber);
        ReserveDTO reserveDTO = entityToDto(reserve);


        return reserveDTO;
    }



}
