package com.example.emlakburada.repository;


import com.example.emlakburada.dto.RealEstateDTO;
import com.example.emlakburada.model.RealEstate;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RealEstateRepository extends JpaRepository<RealEstate, Integer> {

	RealEstateDTO save(Optional<RealEstate> updRlEstt);
    

}
