package com.assignment.cookrecipe.service;

import com.assignment.cookrecipe.model.Recipe;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecipeServiceImplTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipeServiceImplTest.class);

    @Autowired
    private RecipeService recipeService;

    @Test
    public void findAll() throws Exception {
        Set<Recipe> recipes = recipeService.findAllRecipes();
        LOGGER.info("recipes: {}", recipes);
    }
}
