package com.quizapp.accessiblequiz.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // custom table name
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary key

    @Column(nullable = false, unique = true)
    private String username;  // unique username

    @Column(nullable = false)
    private String password;  // hashed password later

    @Column(nullable = false, unique = true)
    private String email;

    private String role;
    
}
