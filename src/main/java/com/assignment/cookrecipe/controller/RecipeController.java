package com.assignment.cookrecipe.controller;

import com.assignment.cookrecipe.model.Recipe;
import com.assignment.cookrecipe.service.RecipeService;
import com.assignment.cookrecipe.util.CustomErrorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
@RestController
@RequestMapping("/api")
public class RecipeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipeController.class);

    @Autowired
    private RecipeService recipeService; //Service which will do all data retrieval/manipulation work

    // -------------------Retrieve All Recipes---------------------------------------------

    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    public ResponseEntity<Set<Recipe>> listAllRecipes() {
        Set<Recipe> recipes = recipeService.findAllRecipes();

        if (recipes.isEmpty()) {
            return new ResponseEntity(new CustomErrorType("No recipe found."), HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        LOGGER.debug("recipes: {}", recipes.size());
        return new ResponseEntity<Set<Recipe>>(recipes, HttpStatus.OK);
    }

}
