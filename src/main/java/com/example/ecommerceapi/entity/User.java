package com.example.ecommerceapi.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    Integer idUser;

    String lastName;
    String firstName;
    String email;
    String password;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    List<Card> cards;



}
