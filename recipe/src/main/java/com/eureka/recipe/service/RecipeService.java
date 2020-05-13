package com.eureka.recipe.service;

import com.eureka.recipe.entity.Recipe;

import java.util.Optional;

public interface RecipeService {
    Optional<Recipe> getRecipeById(Long id);
}
