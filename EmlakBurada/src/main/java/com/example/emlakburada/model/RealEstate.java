package com.example.emlakburada.model;


import com.example.emlakburada.dto.ImageDTO;
import com.example.emlakburada.enums.RealEstateType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RealEstate{
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double price;
    private String description;
    private Integer room;
    private Integer age;
    
    private List<Image> imageList;
    private String floor;
    private Integer numberOfFloor;
    private Double squareM2;
    private RealEstateType realEstateType;
    private Address address;
    private String roomAndLivingRoom;
}
