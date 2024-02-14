package com.anand.productservice.inheritanceDemo.joinTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jtbc_instructor")
public class Instructor extends User {
    private Double avgRating;
}
