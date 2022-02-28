package com.example.emlakburada.repository;


import com.example.emlakburada.model.Advert;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdvertRepository extends JpaRepository<Advert, Integer> {
  
}
