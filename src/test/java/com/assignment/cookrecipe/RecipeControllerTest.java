package com.assignment.cookrecipe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE1_JSON;
import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE2_JSON;
import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE_DETAILS_KEY;
import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE_INGREDIENTS_KEY;
import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE_INSTRUCTIONS_KEY;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(locations = { "classpath:config/context/ctx-test-application.xml" })
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RecipeControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void listAllRecipes() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/recipes").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(RECIPE_DETAILS_KEY)))
                .andExpect(content().string(containsString(RECIPE_INGREDIENTS_KEY)))
                .andExpect(content().string(containsString(RECIPE_INSTRUCTIONS_KEY)));
    }
}
