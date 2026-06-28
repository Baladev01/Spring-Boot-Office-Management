package com.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.office.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}