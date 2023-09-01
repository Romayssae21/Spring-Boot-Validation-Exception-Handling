package com.RomayssaeAPI.Validation.Exception.Handling.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    private String name;
    private  String email;
    private String mobile;
    private String gender;
    private int age;
    private  String nationality;
}
