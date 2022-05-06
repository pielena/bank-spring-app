package com.bank.spring.service;

import com.bank.spring.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    void deleteUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

}
