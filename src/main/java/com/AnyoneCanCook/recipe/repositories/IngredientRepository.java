package com.AnyoneCanCook.recipe.repositories;

import com.AnyoneCanCook.recipe.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
