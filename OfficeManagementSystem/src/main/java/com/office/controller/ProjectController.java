package com.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.office.requestdto.ProjectRequestDTO;
import com.office.responsedto.ProjectResponseDTO;
import com.office.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @PostMapping("/save")
    public ProjectResponseDTO save(
            @RequestBody ProjectRequestDTO dto){

        return service.save(dto);

    }

    @GetMapping("/all")
    public List<ProjectResponseDTO> getAll(){

        return service.getAll();

    }

    @GetMapping("/{id}")
    public ProjectResponseDTO getById(
            @PathVariable Integer id){

        return service.getById(id);

    }

    @PutMapping("/{id}")
    public ProjectResponseDTO update(
            @PathVariable Integer id,
            @RequestBody ProjectRequestDTO dto){

        return service.update(id,dto);

    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Integer id){

        return service.delete(id);

    }

}