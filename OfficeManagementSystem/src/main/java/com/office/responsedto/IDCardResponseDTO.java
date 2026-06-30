package com.office.responsedto;

import lombok.Data;

@Data
public class IDCardResponseDTO {

    private Integer id;

    private String cardNumber;

    private String issueDate;

    private Integer employeeId;

    private String employeeName;

}