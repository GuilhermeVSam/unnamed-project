package com.guilherme.unnamedproject.controller;

import org.springframework.web.bind.annotation.*;

import com.guilherme.unnamedproject.entity.User;
import com.guilherme.unnamedproject.repository.UserRepository;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    @GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello World!";
	}

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
