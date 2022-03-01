package com.example.emlakburada.mapper;

import com.example.emlakburada.dto.AdvertDTO;
import com.example.emlakburada.dto.RealEstateDTO;
import com.example.emlakburada.dto.UserDTO;
import com.example.emlakburada.model.Advert;
import com.example.emlakburada.model.RealEstate;
import com.example.emlakburada.model.User;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import java.util.Set;


@Mapper(componentModel = "spring",uses = {AddressMapper.class,ImageMapper.class})
public interface RealEstateMapper extends BaseMapper<RealEstate, RealEstateDTO>{

    @Named("toAdvertDTO")
    RealEstateDTO toAdvertDTO(RealEstate entity);

    @IterableMapping(qualifiedByName = "toAdvertDTO")
    Set<RealEstateDTO> toAdvertDTOList(Set<RealEstate> entityList);
    
    
    RealEstateDTO updateRealEstateFromDto(RealEstateDTO dto, @MappingTarget RealEstate entity);
}
