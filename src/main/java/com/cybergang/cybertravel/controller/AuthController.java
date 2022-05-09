package com.cybergang.cybertravel.controller;

import com.cybergang.cybertravel.model.User;
import com.cybergang.cybertravel.payload.LoginDto;
import com.cybergang.cybertravel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService service;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto) {
        User user = service.findUserByEmail(loginDto.getEmail());
        if (user != null) {
            if (passwordEncoder().matches(loginDto.getPassword(), user.getPassword())) {
                return new ResponseEntity<>("User signed-in successfully!", HttpStatus.OK);
            }
            return new ResponseEntity<>("Wrong password.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("User don't exists.", HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/signup")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        if (service.existsUserByIdentification(user.getIdentification())) {
            return new ResponseEntity<>("ID is already taken!", HttpStatus.BAD_REQUEST);
        }
        if (service.existsUserByEmail(user.getEmail())) {
            return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
        }
        user.setPassword(passwordEncoder().encode(user.getPassword()));
        service.addUser(user);
        return new ResponseEntity<>("User registered successfully!", HttpStatus.OK);
    }

}
