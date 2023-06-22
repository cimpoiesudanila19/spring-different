package org.example.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

// Spring Data JDBC модель
@Data
@Table()
public class Worker {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String position;

    // Геттеры и сеттеры, конструкторы
}

