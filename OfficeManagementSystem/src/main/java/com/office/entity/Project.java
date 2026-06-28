package com.office.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.office.enums.ProjectStatus;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String projectName;

    private String clientName;

    private String deadline;

    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;

    @JsonIgnore
    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

}