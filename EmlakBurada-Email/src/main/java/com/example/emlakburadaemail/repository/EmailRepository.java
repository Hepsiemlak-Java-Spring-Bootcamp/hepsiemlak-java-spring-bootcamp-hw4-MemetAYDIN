package com.example.emlakburadaemail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.mail.SimpleMailMessage;

import com.example.emlakburadaemail.model.Email;

public interface EmailRepository extends JpaRepository<Email, Integer> {

	void save(SimpleMailMessage message);

}
