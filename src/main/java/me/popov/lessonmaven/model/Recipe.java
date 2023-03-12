package me.popov.lessonmaven.model;

import lombok.*;

import java.util.List;

@Data
public class Recipe {

    private String title;
    private int cookingTime;
    private List<Ingredient> ingredientList;
    private List<String> step;
}