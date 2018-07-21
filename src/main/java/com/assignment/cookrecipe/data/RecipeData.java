package com.assignment.cookrecipe.data;

import com.assignment.cookrecipe.model.Recipe;

import java.util.Set;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
public interface RecipeData {

    Set<Recipe> loadAllRecipes();

}
