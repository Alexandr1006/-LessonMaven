package me.popov.lessonmaven.services;

import me.popov.lessonmaven.converter.IngredientDtoConverter;
import me.popov.lessonmaven.converter.RecipeDtoConverter;
import me.popov.lessonmaven.dto.IngredientDto;
import me.popov.lessonmaven.dto.RecipeDto;
import me.popov.lessonmaven.model.Ingredient;
import me.popov.lessonmaven.model.Recipe;

import java.util.HashMap;
import java.util.Map;

public class IngredientService {
    private int idCounter = 0;
    private final Map<Integer, Ingredient> ingredientMap = new HashMap<>();

    public IngredientDto addIngredient(Ingredient ingredient){
        int id = idCounter++;
        ingredientMap.put(id, ingredient);
        return IngredientDtoConverter.frome(id, ingredient);
    }

    public IngredientDto getRecipe(int id){
        Ingredient ingredient = ingredientMap.get(id);
        if(ingredient != null) {
            return IngredientDtoConverter.frome(id, ingredient);
        }
        return new IngredientDto();
    }
}
