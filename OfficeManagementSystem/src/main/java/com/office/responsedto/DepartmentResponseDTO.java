package com.office.responsedto;

import java.util.List;

import lombok.Data;

@Data
public class DepartmentResponseDTO {

    private Integer id;

    private String departmentName;

    private List<EmployeeResponseDTO> employees;

}