package com.assignment.cookrecipe.dao;

import com.assignment.cookrecipe.model.Recipe;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

@ContextConfiguration(locations = { "classpath:config/context/ctx-test-application.xml" })
@RunWith(SpringRunner.class)
@SpringBootTest
public class RecipeDAOImplTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipeDAOImplTest.class);

    @Autowired
    @Qualifier(value = "recipeDAO")
    private RecipeDAO recipeDAO;

    @Test
    public void findAll() throws Exception {
        Set<Recipe> recipes = recipeDAO.findAll();
        LOGGER.info("recipes: {}", recipes);

        assertNotNull("Recipes is null.", recipes);
        assertFalse("Recipes is empty.", recipes.isEmpty());

        for (Recipe recipe : recipes) {
            assertNotNull("Recipe name is null.", recipe.getName());
            assertNotNull("Recipe type is null.", recipe.getTypeOfDish());
        }
    }
}
