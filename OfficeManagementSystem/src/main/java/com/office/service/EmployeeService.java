package com.office.service;

import java.util.ArrayList;
import java.util.List;

import com.office.common.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import com.office.common.PageResponse;

import com.office.requestdto.EmployeeRequestDTO;
import com.office.responsedto.EmployeeResponseDTO;
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
    public ApiResponse<PageResponse<EmployeeResponseDTO>> pagination(int page, int size){

        ApiResponse<PageResponse<EmployeeResponseDTO>> response =
                new ApiResponse<>();

        try {

            Pageable pageable = PageRequest.of(page, size);

            Page<Employee> employeePage = employeeRepository.findAll(pageable);

            if (employeePage.isEmpty()) {

                response.setStatus(404);
                response.setMessage("Employees not found");
                response.setData(null);

                return response;
            }

            PageResponse<EmployeeResponseDTO> pageResponse = new PageResponse<>();

            List<EmployeeResponseDTO> dtoList = new ArrayList<>();

            for (Employee employee : employeePage.getContent()) {

                EmployeeResponseDTO dto = new EmployeeResponseDTO();

                dto.setId(employee.getId());
                dto.setName(employee.getName());
                dto.setEmail(employee.getEmail());
                dto.setPhoneNumber(employee.getPhoneNumber());
                dto.setStatus(employee.getStatus().name());
                dto.setDepartmentName(employee.getDepartment().getDepartmentName());

                dtoList.add(dto);
            }

            pageResponse.setContent(dtoList);
            pageResponse.setTotalPages(employeePage.getTotalPages());
            pageResponse.setTotalElements(employeePage.getTotalElements());
            pageResponse.setSize(employeePage.getSize());
            pageResponse.setNumber(employeePage.getNumber());
            pageResponse.setFirst(employeePage.isFirst());
            pageResponse.setLast(employeePage.isLast());

            response.setStatus(200);
            response.setMessage("Employees fetched successfully");
            response.setData(pageResponse);

        } catch (Exception e) {

            e.printStackTrace();
            response.setStatus(500);
            response.setMessage(e.getMessage());
            response.setMessage("Internal Server Error");
            response.setData(null);
        }

        return response;
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