package com.anand.productservice.inheritanceDemo.tablePerCLass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tbc_mentor")
public class Mentor extends User {
    private String favStudent;
}
