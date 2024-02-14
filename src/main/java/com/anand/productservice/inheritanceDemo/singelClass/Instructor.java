package com.anand.productservice.inheritanceDemo.singelClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "s_instructor")
public class Instructor extends User {
    private Double avgRating;
}
