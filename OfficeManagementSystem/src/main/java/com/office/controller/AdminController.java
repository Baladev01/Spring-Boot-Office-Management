package com.office.controller;

import com.office.requestdto.LoginRequestDTO;
import com.office.responsedto.LoginResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.office.common.ApiResponse;
import com.office.requestdto.AdminRequestDTO;
import com.office.responsedto.AdminResponseDTO;
import com.office.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping("/signup")
    public ApiResponse<AdminResponseDTO> signup(
            @RequestBody AdminRequestDTO dto){

        return service.save(dto);
    }

    @PostMapping("/login")
    public ApiResponse<LoginResponseDTO> login(
            @RequestBody LoginRequestDTO dto){

        return service.login(dto);
    }

}