package com.office.controller;

import java.util.List;

import com.office.common.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.office.requestdto.EmployeeRequestDTO;
import com.office.responsedto.EmployeeResponseDTO;
import com.office.entity.Employee;
import com.office.service.EmployeeService;
import com.office.common.PageResponse;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/save")
    public EmployeeResponseDTO save(@RequestBody EmployeeRequestDTO dto){

        return service.save(dto);

    }

    @GetMapping("/all")
    public List<EmployeeResponseDTO> getAll(){

        return service.getAll();

    }

    @GetMapping("/{id}")
    public EmployeeResponseDTO getById(@PathVariable Integer id){

        return service.getById(id);

    }

    @PutMapping("/{id}")
    public EmployeeResponseDTO update(@PathVariable Integer id,
                                      @RequestBody EmployeeRequestDTO dto){

        return service.update(id,dto);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){

        return service.delete(id);

    }

    @GetMapping("/page")
    public ApiResponse<PageResponse<EmployeeResponseDTO>> pagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        return service.pagination(page, size);
    }

    @GetMapping("/sort")
    public List<Employee> sort(){

        return service.sortByName();

    }

    @GetMapping("/sortdesc")
    public List<Employee> sortDesc(){

        return service.sortDesc();

    }

}