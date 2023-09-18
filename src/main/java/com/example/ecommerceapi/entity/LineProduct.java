package com.example.ecommerceapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class LineProduct {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lineProduct")
    Integer idProduct;

    float price;
    int quantity;

    @OneToMany
    List<Product> product;

    @OneToOne
    Card card;
}
