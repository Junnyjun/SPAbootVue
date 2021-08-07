package com.example.SPAdev.reserve;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ReserveController {

    @Autowired
    private final ReserveService reserveService;

    @Autowired
    private final ReserveRepository reserveRepository;

    @GetMapping("/reserve")
    public String reserveForm(Model model) {
        model.addAttribute("reserveDTO", new ReserveDTO());
        return "/reserve";
    }

    @PostMapping("/reserve")
    public String reserve(ReserveDTO dto) {

        Long result = reserveService.save(dto);
        log.info("result : " + result);
        return "redirect:/read/" + result;
    }

    @GetMapping("/read/{id}")
    public String read(@PathVariable("id") Long id, Model model) {
        ReserveDTO reserveDTO = reserveService.getReserveById(id);
        model.addAttribute("dto", reserveDTO);

        return "read";
    }

    @GetMapping("/findReserveById")
    public String findReserveByIdForm() {
        return "findReserveById";
    }

    @PostMapping("/findReserveById")
    public String findReserve(@RequestParam Long id, Model model) {

        ReserveDTO reserveDTO = reserveService.getReserveById(id);
        model.addAttribute("dto", reserveDTO);
        return "redirect:/read/" + id;
    }

    @GetMapping("/findReserveByPhoneNumber")
    public String findReserveByPhoneNumberForm() {
        return "findReserveByPhoneNumber";
    }

    @PostMapping("/findReserveByPhoneNumber")
    public String findReserveByPhoneNumber(@RequestParam String phoneNumber,Model model) {
        ReserveDTO reserveDTO = reserveService.getReserveByPhoneNumber(phoneNumber);
        model.addAttribute("dto", reserveDTO);
        return "redirect:/read/" + reserveDTO.getId();
    }

    @GetMapping("/reserveModify/{id}")
    public String reserveModifyForm(@PathVariable("id") Long id, Model model) {
        ReserveDTO reserveDTO = reserveService.getReserveById(id);
        log.info("reserveDTO : " + reserveDTO);
        model.addAttribute("dto", reserveDTO);

        return "reserveModify";
    }

    @PostMapping("/reserveModify/{id}")
    public String reserveModify(@PathVariable("id") Long id, ReserveDTO reserveDTO) {
        reserveService.modifyReserve(reserveDTO);
        return "redirect:/read/" + id;
    }

}
