package com.example.emlakburdabanner.dto;

import lombok.Data;

@Data
public class BannerDTO {
	
	
	private int id;
    private int advertNo;
    private String phone;
    private int total;
    private AddressDTO address;
}
