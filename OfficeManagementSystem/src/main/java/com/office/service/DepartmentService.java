package com.office.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.dto.DepartmentRequestDTO;
import com.office.dto.DepartmentResponseDTO;
import com.office.dto.EmployeeResponseDTO;
import com.office.entity.Department;
import com.office.entity.Employee;
import com.office.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    // Save
    public DepartmentResponseDTO save(DepartmentRequestDTO dto){

        Department department = new Department();

        department.setDepartmentName(dto.getDepartmentName());

        Department savedDepartment = repository.save(department);

        DepartmentResponseDTO response = new DepartmentResponseDTO();

        response.setId(savedDepartment.getId());
        response.setDepartmentName(savedDepartment.getDepartmentName());

        return response;
    }

    // Get All
    public List<DepartmentResponseDTO> getAll(){

        List<Department> departments = repository.findAll();

        List<DepartmentResponseDTO> responseList = new ArrayList<>();

        for(Department department : departments){

            DepartmentResponseDTO response = new DepartmentResponseDTO();

            response.setId(department.getId());
            response.setDepartmentName(department.getDepartmentName());

            List<EmployeeResponseDTO> employeeDTOList = new ArrayList<>();

            if(department.getEmployees()!=null){

                for(Employee employee : department.getEmployees()){

                    EmployeeResponseDTO employeeDTO = new EmployeeResponseDTO();

                    employeeDTO.setId(employee.getId());
                    employeeDTO.setName(employee.getName());
                    employeeDTO.setEmail(employee.getEmail());
                    employeeDTO.setPhoneNumber(employee.getPhoneNumber());
                    employeeDTO.setStatus(employee.getStatus().name());
                    employeeDTO.setDepartmentName(department.getDepartmentName());

                    employeeDTOList.add(employeeDTO);
                }
            }

            response.setEmployees(employeeDTOList);

            responseList.add(response);
        }

        return responseList;
    }

    // Get By Id
    public DepartmentResponseDTO getById(Integer id){

        Department department = repository.findById(id).orElse(null);

        if(department == null){
            return null;
        }

        DepartmentResponseDTO response = new DepartmentResponseDTO();

        response.setId(department.getId());
        response.setDepartmentName(department.getDepartmentName());

        List<EmployeeResponseDTO> employeeDTOList = new ArrayList<>();

        if(department.getEmployees() != null){

            for(Employee employee : department.getEmployees()){

                EmployeeResponseDTO employeeDTO = new EmployeeResponseDTO();

                employeeDTO.setId(employee.getId());
                employeeDTO.setName(employee.getName());
                employeeDTO.setEmail(employee.getEmail());
                employeeDTO.setPhoneNumber(employee.getPhoneNumber());
                employeeDTO.setStatus(employee.getStatus().name());
                employeeDTO.setDepartmentName(department.getDepartmentName());

                employeeDTOList.add(employeeDTO);
            }
        }

        response.setEmployees(employeeDTOList);

        return response;
    }

    // Update
    public DepartmentResponseDTO update(Integer id,
                                        DepartmentRequestDTO dto){

        Department department = repository.findById(id).orElse(null);

        if(department == null){
            return null;
        }

        department.setDepartmentName(dto.getDepartmentName());

        Department updatedDepartment = repository.save(department);

        DepartmentResponseDTO response = new DepartmentResponseDTO();

        response.setId(updatedDepartment.getId());
        response.setDepartmentName(updatedDepartment.getDepartmentName());

        return response;
    }

    // Delete
    public String delete(Integer id){

        repository.deleteById(id);

        return "Department Deleted Successfully";
    }

}