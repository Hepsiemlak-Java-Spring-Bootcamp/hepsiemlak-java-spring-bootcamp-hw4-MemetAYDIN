package com.example.emlakburdabanner.mapper;

import com.example.emlakburdabanner.dto.BannerDTO;
import com.example.emlakburdabanner.model.Banner;
import org.mapstruct.Mapper;
import org.mapstruct.Named;


@Mapper(componentModel = "spring")
public interface BannerMapper extends BaseMapper<Banner, BannerDTO>{

	void updateBannerFromDto(BannerDTO bannerDTO, Banner updtBanner);

	BannerDTO toDeleteDTO(Object deleteById);

	
	
}
