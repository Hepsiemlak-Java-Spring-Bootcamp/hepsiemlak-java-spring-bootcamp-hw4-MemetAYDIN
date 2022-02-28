package com.example.emlakburada.mapper;

import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring",uses = {RealEstateMapper.class, MessageMapper.class})
public interface UserMapper extends BaseMapper<User, UserDTO>{
	
	UserDTO updateUserFromDto(UserDTO dto, @MappingTarget User entity);
}
