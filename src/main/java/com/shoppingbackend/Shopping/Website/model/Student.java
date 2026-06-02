package com.shoppingbackend.Shopping.Website.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    int id;
    String name;

    @Column(unique = true,nullable = false)
    String email;
    @OneToMany(mappedBy = "user")
    List<Laptop>laptopList;
}
