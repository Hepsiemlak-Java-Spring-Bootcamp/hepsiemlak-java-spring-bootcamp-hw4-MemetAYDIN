package com.example.emlakburdabanner.mapper;

import com.example.emlakburdabanner.dto.BannerDTO;
import com.example.emlakburdabanner.model.Banner;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.Optional;

public interface BaseMapper<Entity , DTO> {

    @Named("toEntity")
    @Mapping(target = "creationDate", ignore = true)
    Entity toEntity(DTO dto);

    @Named("toDTO")
    DTO toDTO(Entity entity);
    

    @IterableMapping(qualifiedByName = "toEntity")
    List<Entity> toEntityList(List<DTO> dtoList);

    @IterableMapping(qualifiedByName = "toDTO")
    List<DTO> toDTOList(List<Entity> entityList);
    
    @IterableMapping(qualifiedByName = "toDTO")
    List<DTO> toDTOList(Optional<Banner> optional);

}
