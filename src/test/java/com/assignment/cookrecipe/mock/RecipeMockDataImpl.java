package com.assignment.cookrecipe.mock;

import com.assignment.cookrecipe.model.Recipe;
import com.assignment.cookrecipe.model.RecipeDetail;
import com.assignment.cookrecipe.model.RecipeIngredient;
import com.assignment.cookrecipe.model.RecipeInstruction;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
@Component(value = "recipeData")
public class RecipeMockDataImpl implements RecipeMockData {

    private static final Calendar CALENDAR = Calendar.getInstance();
    private static final Date TODAY = CALENDAR.getTime();

    public Set<Recipe> loadAllRecipes() {
        Set<Recipe> recipes = new LinkedHashSet<>();
        int cntRecipe = 11;
        int cntDetail = 11;
        int cntIngredients = 11;
        int cntInstruction = 11;

        Recipe recipe1 = new Recipe(cntRecipe++, "Pannenkoeken", "Vegetarian");

        recipe1.addDetail(new RecipeDetail(cntDetail++, TODAY, 2));

        recipe1.addIngredient(new RecipeIngredient(cntIngredients++, "1/4 cup butter shopping list"));
        recipe1.addIngredient(new RecipeIngredient(cntIngredients++, "3/4 cup milk"));
        recipe1.addIngredient(new RecipeIngredient(cntIngredients++, "3/4 cup flour"));
        recipe1.addIngredient(new RecipeIngredient(cntIngredients++, "3 eggs"));
        recipe1.addIngredient(new RecipeIngredient(cntIngredients++, "1 cup apple filling (or another flavor)"));

        recipe1.addInstructions(new RecipeInstruction(cntInstruction++, "Melt butter in an 8x8 inch pan"));
        recipe1.addInstructions(new RecipeInstruction(cntInstruction++, "Mix milk, flour, and eggs until smooth"));
        recipe1.addInstructions(new RecipeInstruction(cntInstruction++, "Pour into pan"));
        recipe1.addInstructions(new RecipeInstruction(cntInstruction++, "Spoon on apple filling"));
        recipe1.addInstructions(new RecipeInstruction(cntInstruction++, "Bake at 400 degrees Fahrenheit for 30 minutes"));
        recipe1.addInstructions(new RecipeInstruction(cntInstruction++, "Serve immediately, it will fall"));

        recipes.add(recipe1);

        cntRecipe = 12;
        cntDetail = 21;
        cntIngredients = 21;
        cntInstruction = 21;

        Recipe recipe2 = new Recipe(cntRecipe++, "Erwtensoep", "Vegetarian");

        recipe2.addDetail(new RecipeDetail(cntDetail++, TODAY, 12));

        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "2 l. water"));
        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "500 gr. split peas"));
        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "2 onions"));
        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "2 leeks"));
        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "1 celeriac"));
        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "2 potatoes"));
        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "1 carrots"));
        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "bunch of celery"));
        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "pepper and salt"));
        recipe2.addIngredient(new RecipeIngredient(cntIngredients++, "150 grams of smoked tofu or vegetarian smoked sausage"));

        recipe2.addInstructions(
                new RecipeInstruction(cntInstruction++,
                        "Rinse the peas well and bring them to the boil in the water. Foam the top as the soup boils."));
        recipe2.addInstructions(new RecipeInstruction(cntInstruction++,
                "In the meantime, finely chop the onion and the leek in rings. Peel the celeriac and potatoes and cut into cubes. Clean the carrot and cut into strips. Add the vegetables if the peas have cooked for about half an hour."));
        recipe2.addInstructions(new RecipeInstruction(cntInstruction++, "Cook until the peas are cooked and the soup is thick (30 to 60 minutes)."));
        recipe2.addInstructions(new RecipeInstruction(cntInstruction++,
                "Heat the smoked sausage in a pan for the last 10 minutes, cut into slices and add at the end of the cooking time. If you use smoking tofu, cut it into cubes and let it cook with the soup for the last 10 minutes."));
        recipe2.addInstructions(
                new RecipeInstruction(cntInstruction++,
                        "Cut the celery finely and stir it just before serving by the soup. Season with salt and pepper."));
        recipe2.addInstructions(new RecipeInstruction(cntInstruction++, "Serve in large bowls with rye bread smeared with fresh cream cheese."));

        recipes.add(recipe2);

        return recipes;
    }
}
