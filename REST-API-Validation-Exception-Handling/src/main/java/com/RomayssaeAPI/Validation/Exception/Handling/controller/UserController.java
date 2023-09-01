package com.RomayssaeAPI.Validation.Exception.Handling.controller;

import com.RomayssaeAPI.Validation.Exception.Handling.dto.UserRequest;
import com.RomayssaeAPI.Validation.Exception.Handling.entity.User;
import com.RomayssaeAPI.Validation.Exception.Handling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

     @PostMapping("/signUp")
    public ResponseEntity<User> saveUser(@RequestBody UserRequest userRequest){
        return  new ResponseEntity<>(service.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("fetchAllUsers")
         public ResponseEntity<List<User>> getAllUsers(){
             return ResponseEntity.ok(service.getAllUser());
        }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
         return ResponseEntity.ok(service.getUser(id));
    }

}
