package com.example.jwt;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody UserLogin login) {
        if ("admin".equals(login.getUsername()) && "password".equals(login.getPassword())) {
            return JwtUtil.generateToken(login.getUsername());
        }
        return "Invalid credentials";
    }
}
