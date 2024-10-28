package com.guilherme.unnamedproject.controller;

import com.guilherme.unnamedproject.dto.RegisterUserDTO;
import com.guilherme.unnamedproject.dto.LoginUserDTO;
import com.guilherme.unnamedproject.entity.User;
import com.guilherme.unnamedproject.services.AuthService;
import com.guilherme.unnamedproject.services.JwtService;
import com.guilherme.unnamedproject.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;
    private final AuthService authService;

    @Autowired
    public AuthController(JwtService jwtService, AuthService authService) {
        this.jwtService = jwtService;
        this.authService = authService;
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello World!";
    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody RegisterUserDTO registerUserDto) {
        User registeredUser = authService.signup(registerUserDto);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDTO input) {
        User authenticatedUser = authService.authenticate(input);
        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(jwtToken);
        return ResponseEntity.ok(loginResponse);
    }
}