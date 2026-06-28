package com.office.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.office.dto.EmployeeRequestDTO;
import com.office.dto.EmployeeResponseDTO;
import com.office.entity.Department;
import com.office.entity.Employee;
import com.office.repository.DepartmentRepository;
import com.office.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    // Save
    public EmployeeResponseDTO save(EmployeeRequestDTO dto){

        Department department = departmentRepository
                .findById(dto.getDepartmentId())
                .orElse(null);

        Employee employee = new Employee();

        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setPhoneNumber(dto.getPhoneNumber());
        employee.setStatus(dto.getStatus());
        employee.setDepartment(department);

        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeResponseDTO response = new EmployeeResponseDTO();

        response.setId(savedEmployee.getId());
        response.setName(savedEmployee.getName());
        response.setEmail(savedEmployee.getEmail());
        response.setPhoneNumber(savedEmployee.getPhoneNumber());
        response.setStatus(savedEmployee.getStatus().name());
        response.setDepartmentName(savedEmployee.getDepartment().getDepartmentName());

        return response;
    }

    // Get All
    public List<EmployeeResponseDTO> getAll(){

        List<Employee> employees = employeeRepository.findAll();

        List<EmployeeResponseDTO> responseList = new ArrayList<>();

        for(Employee employee : employees){

            EmployeeResponseDTO response = new EmployeeResponseDTO();

            response.setId(employee.getId());
            response.setName(employee.getName());
            response.setEmail(employee.getEmail());
            response.setPhoneNumber(employee.getPhoneNumber());
            response.setStatus(employee.getStatus().name());
            response.setDepartmentName(employee.getDepartment().getDepartmentName());

            responseList.add(response);
        }

        return responseList;
    }

    // Get By Id
    public EmployeeResponseDTO getById(Integer id){

        Employee employee = employeeRepository.findById(id).orElse(null);

        if(employee == null){
            return null;
        }

        EmployeeResponseDTO response = new EmployeeResponseDTO();

        response.setId(employee.getId());
        response.setName(employee.getName());
        response.setEmail(employee.getEmail());
        response.setPhoneNumber(employee.getPhoneNumber());
        response.setStatus(employee.getStatus().name());
        response.setDepartmentName(employee.getDepartment().getDepartmentName());

        return response;
    }

    // Update
    public EmployeeResponseDTO update(Integer id, EmployeeRequestDTO dto){

        Employee employee = employeeRepository.findById(id).orElse(null);

        if(employee == null){
            return null;
        }

        Department department = departmentRepository
                .findById(dto.getDepartmentId())
                .orElse(null);

        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setPhoneNumber(dto.getPhoneNumber());
        employee.setStatus(dto.getStatus());
        employee.setDepartment(department);

        Employee updatedEmployee = employeeRepository.save(employee);

        EmployeeResponseDTO response = new EmployeeResponseDTO();

        response.setId(updatedEmployee.getId());
        response.setName(updatedEmployee.getName());
        response.setEmail(updatedEmployee.getEmail());
        response.setPhoneNumber(updatedEmployee.getPhoneNumber());
        response.setStatus(updatedEmployee.getStatus().name());
        response.setDepartmentName(updatedEmployee.getDepartment().getDepartmentName());

        return response;
    }

    // Delete
    public String delete(Integer id){

        employeeRepository.deleteById(id);

        return "Employee Deleted Successfully";
    }

    // Pagination
    public Page<Employee> pagination(int page,int size){

        Pageable pageable = PageRequest.of(page,size);

        return employeeRepository.findAll(pageable);
    }

    // Sort ASC
    public List<Employee> sortByName(){

        return employeeRepository.findAll(Sort.by("name"));
    }

    // Sort DESC
    public List<Employee> sortDesc(){

        return employeeRepository.findAll(Sort.by("name").descending());
    }

}