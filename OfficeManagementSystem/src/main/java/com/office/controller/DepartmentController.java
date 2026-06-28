package com.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.office.dto.DepartmentRequestDTO;
import com.office.dto.DepartmentResponseDTO;
import com.office.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/save")
    public DepartmentResponseDTO save(
            @RequestBody DepartmentRequestDTO dto){

        return service.save(dto);

    }

    @GetMapping("/all")
    public List<DepartmentResponseDTO> getAll(){

        return service.getAll();

    }

    @GetMapping("/{id}")
    public DepartmentResponseDTO getById(
            @PathVariable Integer id){

        return service.getById(id);

    }

    @PutMapping("/{id}")
    public DepartmentResponseDTO update(
            @PathVariable Integer id,
            @RequestBody DepartmentRequestDTO dto){

        return service.update(id,dto);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){

        return service.delete(id);

    }

}