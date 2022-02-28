package com.example.emlakburada.dto;


import com.example.emlakburada.enums.RealEstateType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class RealEstateDTO extends BaseEntityDTO {

	
    private Double price;
    private String description;
    private Integer room;
    private Integer livingRoom;
    private Integer age;
    private Integer bathRoom;
    private List<ImageDTO> imageList;
    private String floor;
    private Integer numberOfFloor;
    private Double netSquareMeters;
    private Double squareMeters;
    private RealEstateType realEstateType;
    private AddressDTO address;
    private CategoryDTO mainCategory;
    private CategoryDTO subCategory;
    private String roomAndLivingRoom;
}
