package com.example.emlakburadaemail.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import com.example.emlakburadaemail.model.Email;
import com.example.emlakburadaemail.repository.EmailRepository;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    private final EmailRepository emailRepository;
    
    public void sendMail(String email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("emlakk.hepsii@gmail.com");
        message.setTo(email);
        message.setSubject("Time never comes again.");
        message.setText("Do it today, or regret it tomorrow.");
        emailRepository.save(message);
       
        
        mailSender.send(message);
        
        
    }
}
