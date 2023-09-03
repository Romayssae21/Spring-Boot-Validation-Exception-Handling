package com.RomayssaeAPI.Validation.Exception.Handling.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "USER")
public class User  {

    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private  String email;
    private String mobile;
    private String gender;
    private int age;
    private  String nationality;
}
