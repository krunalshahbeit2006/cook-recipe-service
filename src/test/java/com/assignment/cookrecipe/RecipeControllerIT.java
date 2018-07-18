package com.assignment.cookrecipe;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE1_JSON;
import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE2_JSON;
import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE3_JSON;
import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE4_JSON;
import static com.assignment.cookrecipe.constants.RecipeConstants.RECIPE5_JSON;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RecipeControllerIT {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/api/recipes");
    }

    //@Ignore
    @Test
    public void listAllRecipes() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody(), containsString(RECIPE1_JSON));
        assertThat(response.getBody(), containsString(RECIPE2_JSON));
        assertThat(response.getBody(), containsString(RECIPE3_JSON));
        assertThat(response.getBody(), containsString(RECIPE4_JSON));
        assertThat(response.getBody(), containsString(RECIPE5_JSON));
    }
}