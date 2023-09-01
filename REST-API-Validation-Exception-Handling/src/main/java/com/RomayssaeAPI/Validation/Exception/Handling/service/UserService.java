package com.RomayssaeAPI.Validation.Exception.Handling.service;

import com.RomayssaeAPI.Validation.Exception.Handling.dto.UserRequest;
import com.RomayssaeAPI.Validation.Exception.Handling.entity.User;
import com.RomayssaeAPI.Validation.Exception.Handling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    //the UserRequest will be got by the postman
    public User saveUser(UserRequest userRequest) {

        User user =  User.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .mobile(userRequest.getMobile())
                .gender(userRequest.getGender())
                .build();
        return repository.save(user);
    }
      public List<User> getAllUser(){
        return repository.findAll();
      }

      public User getUser(Long id){
        return repository.findByUserId(id);
      }
}
