package com.RomayssaeAPI.Validation.Exception.Handling.repository;

import com.RomayssaeAPI.Validation.Exception.Handling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
