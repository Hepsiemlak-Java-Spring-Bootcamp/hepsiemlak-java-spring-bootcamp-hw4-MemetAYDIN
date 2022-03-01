package com.example.emlakburada.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Advert{
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer advertNo;
    private String title;
    private String description;
    private Date duration; // date yap
    private Integer putFordward; //one cikarilanlar
    
    private Boolean active;
    
    @Embedded
    private User owner;      // bir ilani bir user yayinlamistir bir user birden fazla ilan yayinlayabilir
    
    @ManyToMany
    private RealEstate realEstates;
}
