package com.office.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.requestdto.ProjectRequestDTO;
import com.office.responsedto.ProjectResponseDTO;
import com.office.entity.Project;
import com.office.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository repository;

    // Save
    public ProjectResponseDTO save(ProjectRequestDTO dto){

        Project project = new Project();

        project.setProjectName(dto.getProjectName());
        project.setClientName(dto.getClientName());
        project.setDeadline(dto.getDeadline());
        project.setProjectStatus(dto.getProjectStatus());

        Project savedProject = repository.save(project);

        ProjectResponseDTO response = new ProjectResponseDTO();

        response.setId(savedProject.getId());
        response.setProjectName(savedProject.getProjectName());
        response.setClientName(savedProject.getClientName());
        response.setDeadline(savedProject.getDeadline());
        response.setProjectStatus(savedProject.getProjectStatus().name());

        return response;
    }

    // Get All
    public List<ProjectResponseDTO> getAll(){

        List<Project> projects = repository.findAll();

        List<ProjectResponseDTO> responseList = new ArrayList<>();

        for(Project project : projects){

            ProjectResponseDTO response = new ProjectResponseDTO();

            response.setId(project.getId());
            response.setProjectName(project.getProjectName());
            response.setClientName(project.getClientName());
            response.setDeadline(project.getDeadline());
            response.setProjectStatus(project.getProjectStatus().name());

            responseList.add(response);
        }

        return responseList;
    }

    // Get By Id
    public ProjectResponseDTO getById(Integer id){

        Project project = repository.findById(id).orElse(null);

        if(project == null){
            return null;
        }

        ProjectResponseDTO response = new ProjectResponseDTO();

        response.setId(project.getId());
        response.setProjectName(project.getProjectName());
        response.setClientName(project.getClientName());
        response.setDeadline(project.getDeadline());
        response.setProjectStatus(project.getProjectStatus().name());

        return response;
    }

    // Update
    public ProjectResponseDTO update(Integer id, ProjectRequestDTO dto){

        Project project = repository.findById(id).orElse(null);

        if(project == null){
            return null;
        }

        project.setProjectName(dto.getProjectName());
        project.setClientName(dto.getClientName());
        project.setDeadline(dto.getDeadline());
        project.setProjectStatus(dto.getProjectStatus());

        Project updatedProject = repository.save(project);

        ProjectResponseDTO response = new ProjectResponseDTO();

        response.setId(updatedProject.getId());
        response.setProjectName(updatedProject.getProjectName());
        response.setClientName(updatedProject.getClientName());
        response.setDeadline(updatedProject.getDeadline());
        response.setProjectStatus(updatedProject.getProjectStatus().name());

        return response;
    }

    // Delete
    public String delete(Integer id){

        repository.deleteById(id);

        return "Project Deleted Successfully";
    }

}