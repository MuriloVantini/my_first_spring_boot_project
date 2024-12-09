package com.example.firstapi.models;

import com.example.firstapi.models.enums.UserType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Name cannot be null
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) // Type cannot be null
    private UserType type;

    private String photo;

    @Column(nullable = false, unique = true) // Email must be unique
    private String email;

    @Column(nullable = false) // Password cannot be null
    private String password;
}

