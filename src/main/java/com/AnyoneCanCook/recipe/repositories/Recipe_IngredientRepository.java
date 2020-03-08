package com.AnyoneCanCook.recipe.repositories;

import com.AnyoneCanCook.recipe.models.Recipe_ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Recipe_IngredientRepository extends JpaRepository<Recipe_ingredient, Long> {
}
