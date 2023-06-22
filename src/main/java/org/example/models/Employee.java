package org.example.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

// JPA модель
@Data
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String imageUrl;
}