package com.anand.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Products extends BaseModel {

    private String title;
    private double price;
    @ManyToOne
    private Catrgory category;
    private String description;
    private String image;
}
