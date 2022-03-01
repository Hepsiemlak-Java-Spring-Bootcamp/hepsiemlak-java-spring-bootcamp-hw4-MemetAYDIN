package com.example.emlakburada.service;


import com.example.emlakburada.dto.MessageDTO;
import com.example.emlakburada.mapper.MessageMapper;
import com.example.emlakburada.model.Message;
import com.example.emlakburada.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageMapper messageMapper;
    private final MessageRepository messageRepository;

    public List<MessageDTO> getAllList() {
        return messageMapper.toDTOList(messageRepository.findAll());
    }

    public MessageDTO create(MessageDTO messageDTO) {
        return messageMapper.toDTO(messageRepository.save(messageMapper.toEntity(messageDTO)));
    }

   public MessageDTO update(MessageDTO messageDTO, Message updtMessage) {
    	
    	Optional<Message> updMssg=messageRepository.findById(messageDTO.getId());
    	messageMapper.updateRealEstateFromDto(messageDTO, updtMessage);
    	MessageDTO update=messageRepository.save(updMssg);
    	
        return update;
    }
    
    public MessageDTO delete(MessageDTO messageDTO) {

        return messageMapper.toDTO(messageRepository.delete(messageMapper.toEntity(messageDTO)));
    }

    public MessageDTO getMessageById(int id){
        return messageMapper.toDTO(messageRepository.findById(id));
    }

}
