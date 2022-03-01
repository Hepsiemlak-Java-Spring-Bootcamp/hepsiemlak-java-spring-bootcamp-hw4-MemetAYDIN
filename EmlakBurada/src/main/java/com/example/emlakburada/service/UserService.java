package com.example.emlakburada.service;

import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.mapper.UserMapper;
import com.example.emlakburada.model.User;
import com.example.emlakburada.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public List<UserDTO> findAll() {
        return userMapper.toDTOList(userRepository.findAll());
    }

    public UserDTO create(UserDTO userDTO) {
        return userMapper.toDTO(userRepository.save(userMapper.toEntity(userDTO)));
    }
    
    public UserDTO update(UserDTO userDTO, User updUser) {
    	
    	Optional<User> user=userRepository.findById(userDTO.getId());
    	userMapper.updateUserFromDto(userDTO, updUser);
    	UserDTO update=userRepository.save(user);
    	
        return update;
    }


    public UserDTO delete(UserDTO userDTO) {
        return userMapper.toDTO(userRepository.delete(userMapper.toEntity(userDTO)));
    }
    
    public UserDTO getUserById(Integer id){
        return userMapper.toDTO(userRepository.findById(id));
    }
}
