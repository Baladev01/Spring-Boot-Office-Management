package com.office.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.office.entity.Admin;
import com.office.repository.AdminRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private AdminRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Admin admin = repository.findByAdminName(username)
                .orElseThrow(() ->
                        new UsernameNotFoundException("Admin Not Found"));

        return User.builder()
                .username(admin.getAdminName())
                .password(admin.getPassword())
                .authorities(Collections.emptyList())
                .build();
    }
}