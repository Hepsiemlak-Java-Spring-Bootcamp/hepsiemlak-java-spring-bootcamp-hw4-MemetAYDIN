package com.example.emlakburdabanner.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.emlakburdabanner.dto.BannerDTO;
import com.example.emlakburdabanner.model.Banner;

public interface BannerRepository extends JpaRepository<Banner, Integer> {

	BannerDTO save(Optional<Banner> updBnnr);

}
