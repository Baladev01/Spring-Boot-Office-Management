package com.office.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.dto.IDCardRequestDTO;
import com.office.dto.IDCardResponseDTO;
import com.office.entity.Employee;
import com.office.entity.IDCard;
import com.office.repository.EmployeeRepository;
import com.office.repository.IDCardRepository;

@Service
public class IDCardService {

    @Autowired
    private IDCardRepository repository;

    @Autowired
    private EmployeeRepository employeeRepository;

    // Save
    public IDCardResponseDTO save(IDCardRequestDTO dto){

        Employee employee = employeeRepository
                .findById(dto.getEmployeeId())
                .orElse(null);

        IDCard card = new IDCard();

        card.setCardNumber(dto.getCardNumber());
        card.setIssueDate(dto.getIssueDate());
        card.setEmployee(employee);

        IDCard savedCard = repository.save(card);

        IDCardResponseDTO response = new IDCardResponseDTO();

        response.setId(savedCard.getId());
        response.setCardNumber(savedCard.getCardNumber());
        response.setIssueDate(savedCard.getIssueDate());
        response.setEmployeeId(savedCard.getEmployee().getId());
        response.setEmployeeName(savedCard.getEmployee().getName());

        return response;
    }

    // Get All
    public List<IDCardResponseDTO> getAll(){

        List<IDCard> cards = repository.findAll();

        List<IDCardResponseDTO> responseList = new ArrayList<>();

        for(IDCard card : cards){

            IDCardResponseDTO response = new IDCardResponseDTO();

            response.setId(card.getId());
            response.setCardNumber(card.getCardNumber());
            response.setIssueDate(card.getIssueDate());

            if(card.getEmployee()!=null){

                response.setEmployeeId(card.getEmployee().getId());
                response.setEmployeeName(card.getEmployee().getName());

            }

            responseList.add(response);
        }

        return responseList;
    }

    // Get By Id
    public IDCardResponseDTO getById(Integer id){

        IDCard card = repository.findById(id).orElse(null);

        if(card == null){
            return null;
        }

        IDCardResponseDTO response = new IDCardResponseDTO();

        response.setId(card.getId());
        response.setCardNumber(card.getCardNumber());
        response.setIssueDate(card.getIssueDate());

        if(card.getEmployee()!=null){

            response.setEmployeeId(card.getEmployee().getId());
            response.setEmployeeName(card.getEmployee().getName());

        }

        return response;
    }

    // Delete
    public String delete(Integer id){

        repository.deleteById(id);

        return "ID Card Deleted Successfully";
    }

}