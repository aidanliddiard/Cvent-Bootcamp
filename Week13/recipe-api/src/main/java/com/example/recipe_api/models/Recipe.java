package com.example.recipe_api.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
//hibernate needs no args constructor
@NoArgsConstructor
@AllArgsConstructor

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "name is mandatory")
    private String name;

    @NotBlank(message= "instructions are necessary")
    private String instructions;

    @Min(value = 1, message = "cooking time should be at least 1 minute")
    private int cookingTimeInMinutes;
    private boolean isVegan;
    private boolean isNutFree;
    private boolean isGlutenFree;
    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

}