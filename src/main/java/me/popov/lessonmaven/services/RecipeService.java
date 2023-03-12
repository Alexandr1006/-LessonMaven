package me.popov.lessonmaven.services;

import me.popov.lessonmaven.converter.RecipeDtoConverter;
import me.popov.lessonmaven.dto.RecipeDto;
import me.popov.lessonmaven.model.Ingredient;
import me.popov.lessonmaven.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecipeService {
    private int idCounter = 0;
    private final Map<Integer, Recipe> recipeMap = new HashMap<>();

    public RecipeDto addRecipe(Recipe recipe){
        int id = idCounter++;
        recipeMap.put(id, recipe);
        return RecipeDtoConverter.frome(id, recipe);
    }

    public RecipeDto getRecipe(int id){
        Recipe recipe = recipeMap.get(id);
        if(recipe != null) {
            return RecipeDtoConverter.frome(id, recipe);
        }
        return null;
    }

}
