package com.assignment.cookrecipe.service;

import com.assignment.cookrecipe.data.RecipeData;
import com.assignment.cookrecipe.model.Recipe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
@Service(value = "recipeService")
public class RecipeServiceImpl implements RecipeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipeServiceImpl.class);

    @Autowired
    private RecipeData recipeData;

    public Set<Recipe> findAllRecipes() {
        Set<Recipe> recipes;

        // TODO: Create DAO implementation and use persistence api asap
        recipes = recipeData.loadAllRecipes();
        LOGGER.debug("recipes: {}", recipes);

        return recipes;
    }

}
