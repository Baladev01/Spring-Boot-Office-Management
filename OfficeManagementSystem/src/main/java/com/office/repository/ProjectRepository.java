package com.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.office.entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer>{

}