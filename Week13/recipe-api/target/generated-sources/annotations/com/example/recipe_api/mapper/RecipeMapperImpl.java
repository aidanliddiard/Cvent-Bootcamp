package com.example.recipe_api.mapper;

import com.example.recipe_api.models.Recipe;
import com.example.recipe_api.models.dto.CreateRecipeDTO;
import com.example.recipe_api.models.dto.RecipeDTO;
import com.example.recipe_api.models.dto.UpdateRecipeDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-12T08:29:49-0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class RecipeMapperImpl implements RecipeMapper {

    @Override
    public RecipeDTO toRecipeDTO(Recipe recipe) {
        if ( recipe == null ) {
            return null;
        }

        RecipeDTO recipeDTO = new RecipeDTO();

        recipeDTO.setId( recipe.getId() );
        recipeDTO.setName( recipe.getName() );
        recipeDTO.setInstructions( recipe.getInstructions() );
        recipeDTO.setCookingTimeInMinutes( recipe.getCookingTimeInMinutes() );
        recipeDTO.setVegan( recipe.isVegan() );
        recipeDTO.setNutFree( recipe.isNutFree() );
        recipeDTO.setGlutenFree( recipe.isGlutenFree() );

        return recipeDTO;
    }

    @Override
    public Recipe toRecipe(RecipeDTO recipeDTO) {
        if ( recipeDTO == null ) {
            return null;
        }

        Recipe recipe = new Recipe();

        recipe.setId( recipeDTO.getId() );
        recipe.setName( recipeDTO.getName() );
        recipe.setInstructions( recipeDTO.getInstructions() );
        recipe.setCookingTimeInMinutes( recipeDTO.getCookingTimeInMinutes() );
        recipe.setVegan( recipeDTO.isVegan() );
        recipe.setNutFree( recipeDTO.isNutFree() );
        recipe.setGlutenFree( recipeDTO.isGlutenFree() );

        return recipe;
    }

    @Override
    public Recipe fromCreateRecipeDTO(CreateRecipeDTO createRecipeDTO) {
        if ( createRecipeDTO == null ) {
            return null;
        }

        Recipe recipe = new Recipe();

        recipe.setName( createRecipeDTO.getName() );
        recipe.setInstructions( createRecipeDTO.getInstructions() );
        recipe.setCookingTimeInMinutes( createRecipeDTO.getCookingTimeInMinutes() );
        recipe.setVegan( createRecipeDTO.isVegan() );
        recipe.setNutFree( createRecipeDTO.isNutFree() );
        recipe.setGlutenFree( createRecipeDTO.isGlutenFree() );

        return recipe;
    }

    @Override
    public Recipe fromUpdateRecipeDTO(UpdateRecipeDTO updateRecipeDTO) {
        if ( updateRecipeDTO == null ) {
            return null;
        }

        Recipe recipe = new Recipe();

        return recipe;
    }
}
