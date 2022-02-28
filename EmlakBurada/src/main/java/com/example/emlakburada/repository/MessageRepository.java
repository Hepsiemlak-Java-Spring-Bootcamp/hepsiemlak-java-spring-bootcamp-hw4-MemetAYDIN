package com.example.emlakburada.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.emlakburada.dto.RealEstateDTO;
import com.example.emlakburada.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

	
}
