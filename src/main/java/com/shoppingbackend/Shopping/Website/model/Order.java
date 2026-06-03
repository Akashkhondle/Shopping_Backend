package com.shoppingbackend.Shopping.Website.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private UUID id;
    @Column(nullable = false)
    private int totalPrice;
    @Column(nullable = false)
    private int totalQuantity;
    @ManyToOne
    AppUser buyer;
    @OneToMany
    List<Product> productList;

}
