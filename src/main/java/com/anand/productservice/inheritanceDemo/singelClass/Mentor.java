package com.anand.productservice.inheritanceDemo.singelClass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "s_mentor")
public class Mentor extends User {
    private String favStudent;
}
