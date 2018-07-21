package com.assignment.cookrecipe.service;

import com.assignment.cookrecipe.model.Recipe;

import java.util.Set;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
public interface RecipeService {

    Set<Recipe> findAllRecipes();

}
