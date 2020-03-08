package com.AnyoneCanCook.recipe.repositories;

import com.AnyoneCanCook.recipe.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
