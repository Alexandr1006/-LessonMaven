package me.popov.lessonmaven.converter;

import me.popov.lessonmaven.dto.IngredientDto;
import me.popov.lessonmaven.dto.RecipeDto;
import me.popov.lessonmaven.model.Ingredient;

public class IngredientDtoConverter {
    public static IngredientDto frome(int id, Ingredient ingredient){
        return new IngredientDto(id, ingredient.getName(), ingredient.getQuantity(), ingredient.getUnit());
    }
}
