package com.example.gateway.controller;

import com.example.gateway.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {

    @Autowired
    private JwtTokenService jwtTokenService;

    @PostMapping("/api/signin")
    public ResponseEntity<?> signIn(@RequestBody User user) {
        // TODO: authenticate the user using the provided credentials
        // If authentication is successful:
        String token = jwtTokenService.generateToken(user.getUsername());
        return ResponseEntity.ok(token);
        // If authentication fails:
        // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
