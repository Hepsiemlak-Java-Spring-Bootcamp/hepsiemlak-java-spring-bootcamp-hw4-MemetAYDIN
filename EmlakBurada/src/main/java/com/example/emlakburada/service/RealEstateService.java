package com.example.emlakburada.service;

import com.example.emlakburada.dto.RealEstateDTO;
import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.mapper.RealEstateMapper;
import com.example.emlakburada.model.RealEstate;
import com.example.emlakburada.model.User;
import com.example.emlakburada.repository.RealEstateRepository;
import com.example.emlakburada.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class RealEstateService {
    private final RealEstateMapper realEstateMapper;
    private final RealEstateRepository realEstateRepository;
    private final UserRepository userRepository;

    public RealEstateDTO getAllList() {
        return realEstateMapper.toDTOList(realEstateRepository.findAll());
    }

    public RealEstateDTO create(RealEstateDTO realEstateDTO) {
        return realEstateMapper.toDTO(realEstateRepository.save(realEstateMapper.toEntity(realEstateDTO)));
    }
    
    public RealEstateDTO delete(int realEstateNo) {
        return realEstateMapper.toDTO(realEstateRepository.deleteById(realEstateNo));
    }

    public RealEstateDTO update(RealEstateDTO realEstateDTO, RealEstate updtRealEstate) {
    	
    	Optional<RealEstate> updRlEstt=realEstateRepository.findById(realEstateDTO.getId());
    	realEstateMapper.updateRealEstateFromDto(realEstateDTO, updtRealEstate);
    	RealEstateDTO update=realEstateRepository.save(updRlEstt);
    	
        return update;
    }


    public RealEstateDTO getRealEstateById(int id){
        return realEstateMapper.toDTO(realEstateRepository.getById(id));
    }


}
