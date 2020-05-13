package com.eureka.recipe.controller;

import com.eureka.recipe.entity.Recipe;
import com.eureka.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RecipeController {
    @Autowired
    private Environment environment;

    @Autowired
    private RecipeService recipeService;

    @RequestMapping("/{id}")
    public Recipe getRecipeById(@PathVariable final Long id) {
        return recipeService.getRecipeById(id).get();
    }

}
