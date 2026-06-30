package com.office.service;

import com.office.requestdto.LoginRequestDTO;
import com.office.responsedto.LoginResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.office.common.ApiResponse;
import com.office.entity.Admin;
import com.office.repository.AdminRepository;
import com.office.requestdto.AdminRequestDTO;
import com.office.responsedto.AdminResponseDTO;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public ApiResponse<AdminResponseDTO> save(AdminRequestDTO dto) {

        ApiResponse<AdminResponseDTO> response = new ApiResponse<>();

        Admin admin = new Admin();

        admin.setAdminName(dto.getAdminName());

        admin.setPassword(
                passwordEncoder.encode(dto.getPassword())
        );

        Admin savedAdmin = repository.save(admin);

        AdminResponseDTO responseDTO = new AdminResponseDTO();

        responseDTO.setId(savedAdmin.getId());
        responseDTO.setAdminName(savedAdmin.getAdminName());

        response.setStatus(201);
        response.setMessage("Admin Registered Successfully");
        response.setData(responseDTO);

        return response;
    }

    public ApiResponse<LoginResponseDTO> login(LoginRequestDTO dto) {

        ApiResponse<LoginResponseDTO> response = new ApiResponse<>();

        Admin admin = repository.findByAdminName(dto.getAdminName())
                .orElse(null);

        if (admin == null) {

            response.setStatus(404);
            response.setMessage("Admin Not Found");
            response.setData(null);

            return response;
        }

        boolean check = passwordEncoder.matches(
                dto.getPassword(),
                admin.getPassword()
        );

        if (check) {

            LoginResponseDTO responseDTO = new LoginResponseDTO();

            responseDTO.setId(admin.getId());
            responseDTO.setAdminName(admin.getAdminName());

            response.setStatus(200);
            response.setMessage("Login Successful");
            response.setData(responseDTO);

        } else {

            response.setStatus(401);
            response.setMessage("Invalid Password");
            response.setData(null);
        }

        return response;
    }
}