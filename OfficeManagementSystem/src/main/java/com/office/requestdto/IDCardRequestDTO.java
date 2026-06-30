package com.office.requestdto;

import lombok.Data;

@Data
public class IDCardRequestDTO {

    private String cardNumber;

    private String issueDate;

    private Integer employeeId;

}