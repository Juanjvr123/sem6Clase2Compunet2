package com.example.demo.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.IUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers(0, 10);
    }

    @GetMapping("/save")
    public User saveUser() {
        User user = new User();
        user.setUsername("john_doe");
        user.setEmail("john.doe@example.com");
        user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        user.setBio("My bio!");
        user.setPasswordHash("123456");
        return userService.save(user);
    }
}
