package com.office.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.office.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{

    Optional<Admin> findByAdminName(String adminName);

}