package com.anand.productservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Catrgory  extends BaseModel{

    private String name;

}
