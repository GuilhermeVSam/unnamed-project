package com.guilherme.unnamedproject.service;

import com.guilherme.unnamedproject.entity.User;
import com.guilherme.unnamedproject.repository.UserRepository;

public class UserService{
    UserRepository userRepository;
    public UserService(){};

    public User addUser(User user){
        return userRepository.save(user);
    }

}