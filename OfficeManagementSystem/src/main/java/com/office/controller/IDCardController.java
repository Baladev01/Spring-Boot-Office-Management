package com.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.office.dto.IDCardRequestDTO;
import com.office.dto.IDCardResponseDTO;
import com.office.service.IDCardService;

@RestController
@RequestMapping("/idcard")
public class IDCardController {

    @Autowired
    private IDCardService service;

    @PostMapping("/save")
    public IDCardResponseDTO save(
            @RequestBody IDCardRequestDTO dto){

        return service.save(dto);

    }

    @GetMapping("/all")
    public List<IDCardResponseDTO> getAll(){

        return service.getAll();

    }

    @GetMapping("/{id}")
    public IDCardResponseDTO getById(
            @PathVariable Integer id){

        return service.getById(id);

    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Integer id){

        return service.delete(id);

    }

}