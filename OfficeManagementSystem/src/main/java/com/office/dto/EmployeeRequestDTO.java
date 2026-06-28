package com.office.dto;

import com.office.enums.EmployeeStatus;
import lombok.Data;

@Data
public class EmployeeRequestDTO {

    private String name;

    private String email;

    private String phoneNumber;

    private EmployeeStatus status;

    private Integer departmentId;

}