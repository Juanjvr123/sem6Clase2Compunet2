package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.repository.IRoleRepository;
import com.example.demo.service.IRoleService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements IRoleService{
    
    private final IRoleRepository roleRepository;

    @Override
    public Role findById(Integer id) {
        return roleRepository.findById(id).orElseThrow( () -> new RuntimeException("Role not found"));
    }
}
