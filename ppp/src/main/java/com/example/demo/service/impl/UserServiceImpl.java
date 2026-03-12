package com.example.demo.service.impl;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.IUserRepository;
import com.example.demo.service.IRoleService;
import com.example.demo.service.IUserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    private final IRoleService roleService;

    @Override
    public List<User> getAllUsers(Integer offset, Integer limit) {
        Sort sort = Sort.by("id").descending();
        Pageable pageable = PageRequest.of(offset, limit, sort);
        return userRepository.findAll(pageable).toList();
    }

    @Override
    public User save(User user) {
        Role role = roleService.findById(user.getRole().getId());
        user.setRole(role);
        return userRepository.save(user);
    }

    @Override
    public void remove(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

}
