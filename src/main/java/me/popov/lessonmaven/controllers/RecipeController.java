package me.popov.lessonmaven.controllers;

import lombok.RequiredArgsConstructor;
import me.popov.lessonmaven.dto.RecipeDto;
import me.popov.lessonmaven.model.Recipe;
import me.popov.lessonmaven.services.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;


    @GetMapping("/id")
    public RecipeDto getRecipe(@PathVariable("id") int id){
        return recipeService.getRecipe(id);
    }
@PostMapping
    public RecipeDto addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
}
}
