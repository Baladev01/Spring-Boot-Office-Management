package com.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.office.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}