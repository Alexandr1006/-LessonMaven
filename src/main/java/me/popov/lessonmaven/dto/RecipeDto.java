package me.popov.lessonmaven.dto;

import me.popov.lessonmaven.model.Ingredient;
import me.popov.lessonmaven.model.Recipe;

import java.util.List;

public class RecipeDto {
    private final int id;
    private final String title;
    private final int cookingTime;
    private final List<Ingredient> ingredientList;
    private  List<String> step;

    public RecipeDto(int id, String title, int cookingTime, List<Ingredient> ingredientList, List<String> step) {
        this.id = id;
        this.title = title;
        this.cookingTime = cookingTime;
        this.ingredientList = ingredientList;
        this.step = step;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public List<String> getStep() {
        return step;
    }

    public void setStep(List<String> step) {
        this.step = step;
    }
}
