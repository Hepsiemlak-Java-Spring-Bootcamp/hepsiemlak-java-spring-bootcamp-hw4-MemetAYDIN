package com.example.emlakburada.controller;

import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.model.User;
import com.example.emlakburada.repository.UserRepository;
import com.example.emlakburada.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserRepository userRepo;

    @GetMapping
    ResponseEntity<List<UserDTO>> getAllList(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO){
    	
        return ResponseEntity.ok(userService.create(userDTO));
    }
    @PostMapping
    ResponseEntity<UserDTO> update(@RequestBody UserDTO userDTO,@RequestBody User updDTO){

        return ResponseEntity.ok(userService.update(userDTO,updDTO));
    }
    
    @PostMapping
    ResponseEntity<UserDTO> delete(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.delete(userDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<UserDTO> getUserById(@PathVariable Integer id){
        return ResponseEntity.ok(userService.getUserById(id));
    }
}
