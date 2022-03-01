package com.example.emlakburada.repository;

import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	UserDTO save(Optional<User> user);

}
