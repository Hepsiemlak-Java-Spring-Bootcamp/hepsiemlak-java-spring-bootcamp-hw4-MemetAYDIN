package com.example.emlakburdabanner.service;


import com.example.emlakburdabanner.dto.BannerDTO;
import com.example.emlakburdabanner.mapper.BannerMapper;
import com.example.emlakburdabanner.model.Banner;
import com.example.emlakburdabanner.repository.BannerRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BannerService {
    private final BannerMapper bannerMapper;
    private final BannerRepository bannerRepository;
    
    List<Banner> bannerList = new ArrayList<>();

    public List<BannerDTO> getAllList() {
        return bannerMapper.toDTOList(bannerRepository.findAll());
    }
    
    public BannerDTO getByID(int bannerNo) {
        return (BannerDTO)bannerMapper.toDTO(bannerRepository.findById(bannerNo));
    }

    public BannerDTO create(BannerDTO bannerDTO) {
        Banner banner = bannerMapper.toEntity(bannerDTO);
        bannerList.add(banner);
        return bannerMapper.toDTO(bannerRepository.save(banner));
    }
    
    public BannerDTO delete(int bannerNo) {

    		return (BannerDTO) bannerMapper.toDTO(bannerRepository.findById(bannerNo));
     }
    
    public BannerDTO update(BannerDTO bannerDTO, Banner updtBanner) {
    	
    	Optional<Banner> updBnnr=bannerRepository.findById(bannerDTO.getId());
    	bannerMapper.updateBannerFromDto(bannerDTO, updtBanner);
    	BannerDTO update=bannerRepository.save(updBnnr);
    	
        return update;
    }

}
