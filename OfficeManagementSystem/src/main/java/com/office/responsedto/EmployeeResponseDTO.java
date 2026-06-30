package com.office.responsedto;

import lombok.Data;

@Data
public class EmployeeResponseDTO {

    private Integer id;

    private String name;

    private String email;

    private String phoneNumber;

    private String status;

    private String departmentName;

}