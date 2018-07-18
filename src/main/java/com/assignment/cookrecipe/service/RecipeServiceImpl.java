package com.assignment.cookrecipe.service;

import com.assignment.cookrecipe.data.RecipeData;
import com.assignment.cookrecipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
@Service("recipeService")
public class RecipeServiceImpl implements RecipeService {

    private RecipeData recipeData = new RecipeData();

    private List<Recipe> recipes;

    public List<Recipe> findAllRecipes() {
        recipes = recipeData.loadAllRecipes();

        return recipes;
    }

}
