package com.RomayssaeAPI.Validation.Exception.Handling.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "Username could not be not")
    private String name;
    @Email(message = "Invalid email address")
    private  String email;
    @NotNull
    @Pattern(regexp="^\\d{10}$", message = "Invalid mobile number")
    private String mobile;
    private String gender;
    @Min(16)
    @Max(65)
    private int age;
    @NotBlank
    private  String nationality;
}
