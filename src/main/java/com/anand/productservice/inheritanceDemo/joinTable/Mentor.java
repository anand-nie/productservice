package com.anand.productservice.inheritanceDemo.joinTable;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jtbc_mentor")
public class Mentor extends User {
    private String favStudent;
}
