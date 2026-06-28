package com.office.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "id_card")
public class IDCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cardNumber;

    private String issueDate;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}