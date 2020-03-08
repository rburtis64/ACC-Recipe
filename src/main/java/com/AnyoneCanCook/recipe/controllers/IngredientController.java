package com.AnyoneCanCook.recipe.controllers;

import com.AnyoneCanCook.recipe.models.Ingredient;
import com.AnyoneCanCook.recipe.repositories.IngredientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ingredients")
public class IngredientController {
    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping
    public List<Ingredient> list(){
        return ingredientRepository.findAll();
    }
    
    @GetMapping
    @RequestMapping("{id}")
    public Ingredient get(@PathVariable Long id){
        return ingredientRepository.getOne(id);
    }

    @PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    public Ingredient create(@RequestBody final Ingredient ingredient){
        return ingredientRepository.saveAndFlush(ingredient);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        ingredientRepository.deleteById(id);
    }

    //Because this is a PUT, we expect all attributes to be passed in. A PATCH would only need what is required
    //TODO: Add validation that all attributes are passed in, otherwise return a 400 bad payload
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Ingredient update(@PathVariable Long id, @RequestBody Ingredient ingredient){
        Ingredient existingIngredient = ingredientRepository.getOne(id);
        BeanUtils.copyProperties(ingredient, existingIngredient, "id");
        return ingredientRepository.saveAndFlush(existingIngredient);
    }

}
