package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface IUserService {

    List<User> getAllUsers(Integer offInteger, Integer limit);

    User save(User user);

    void remove(Integer id);

    User findById(Integer id);
}
