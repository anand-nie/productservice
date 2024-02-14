package com.anand.productservice.inheritanceDemo.tablePerCLass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tbc_instructor")
public class Instructor extends User {
    private Double avgRating;
}
