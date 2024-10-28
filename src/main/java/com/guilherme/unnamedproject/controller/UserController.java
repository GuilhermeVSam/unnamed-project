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

    @GetMapping("/users")
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id){
        return userRepository.findById(id).orElseThrow();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        User userToUpdate = userRepository.findById(id).orElseThrow();
        userToUpdate.setName(user.getName());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setUsername(user.getUsername());
        return userRepository.save(userToUpdate);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
    }
}
