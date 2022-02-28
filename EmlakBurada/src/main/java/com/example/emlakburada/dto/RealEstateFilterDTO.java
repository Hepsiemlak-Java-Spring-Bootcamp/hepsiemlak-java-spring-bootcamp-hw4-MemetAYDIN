package com.example.emlakburada.dto;


import com.example.emlakburada.enums.RealEstateType;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class RealEstateFilterDTO extends BaseEntityDTO{
    private Double maxPrice;
    private Double minPrice;
//    private List<Integer>  age;
//    private List<Integer> bathRoom;
//    private List<String> floor;
//    private List<Integer> numberOfFloor;

    private Double maxSquareM2;
    private RealEstateType realEstateType;
    private AddressDTO addressDTO;
    private CategoryDTO mainCategory;
//    private List<CategoryDTO> subCategory;
//    private List<String> roomAndLivingRoomList;
}
