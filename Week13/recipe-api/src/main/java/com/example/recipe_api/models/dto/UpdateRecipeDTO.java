package com.example.recipe_api.models.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRecipeDTO {
    @NotBlank(message = "name is mandatory")
    private String name;

    @NotBlank(message= "instructions are necessary")
    private String instructions;

    @Min(value = 1, message = "cooking time should be at least 1 minute")
    private int cookingTimeInMinutes;
    private boolean isVegan;
    private boolean isNutFree;
    private boolean isGlutenFree;
}
