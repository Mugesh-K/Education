package com.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.dto.LoginDTO;
import com.education.entity.User;
import com.education.service.LoginService;

@RestController
@RequestMapping("/api/login-api")
public class LoginController {
	
	@Autowired
    private LoginService service;
	
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginDTO loginDTO) {
        User user = service.login(loginDTO);
        if (user != null) {
            return ResponseEntity.ok("Login successful ...");
        } else {
            return ResponseEntity.status(201).body("Invalid credentials.");
        }
    }
}
