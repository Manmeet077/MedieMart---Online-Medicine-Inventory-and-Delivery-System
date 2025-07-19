package com.mediemart.controller;

import com.mediemart.model.User;
import com.mediemart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        repo.save(user);
        return "Registration successful!";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User found = repo.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if (found != null) {
            return "Login success!";
        }
        return "Invalid credentials!";
    }
}
