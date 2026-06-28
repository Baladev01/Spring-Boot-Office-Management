package com.office.dto;

import lombok.Data;

@Data
public class IDCardResponseDTO {

    private Integer id;

    private String cardNumber;

    private String issueDate;

    private Integer employeeId;

    private String employeeName;

}