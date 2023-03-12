package me.popov.lessonmaven.converter;

import me.popov.lessonmaven.dto.RecipeDto;
import me.popov.lessonmaven.model.Ingredient;
import me.popov.lessonmaven.model.Recipe;

public class RecipeDtoConverter {
    public static RecipeDto frome(int id, Recipe recipe){
        return new RecipeDto(id, recipe.getTitle(), recipe.getCookingTime(), recipe.getIngredientList(), recipe.getStep());
    }
}
