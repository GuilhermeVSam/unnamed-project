package com.guilherme.unnamedproject.services;

import org.springframework.stereotype.Service;

import com.guilherme.unnamedproject.entity.User;
import com.guilherme.unnamedproject.repository.UserRepository;

@Service
public class UserService{
    UserRepository userRepository;
    public UserService(){};

    public User addUser(User user){
        return userRepository.save(user);
    }

}