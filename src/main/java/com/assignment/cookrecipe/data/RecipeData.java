package com.assignment.cookrecipe.data;

import com.assignment.cookrecipe.model.Recipe;
import com.assignment.cookrecipe.model.RecipeDetail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
public class RecipeData {

    public List<Recipe> loadAllRecipes() {
        List<Recipe> recipes = new ArrayList<>();

        RecipeDetail recipeDetail1 = new RecipeDetail(new Date(), "Vegetarian", 2);
        recipeDetail1.getListOfIngredients().addAll(
                Arrays.asList("1/4 cup butter shopping list", "3/4 cup milk", "3/4 cup flour", "3 eggs", "1 cup apple filling (or another flavor)"));
        recipeDetail1.getCookingInstructions().addAll(Arrays
                .asList("Melt butter in an 8x8 inch pan", "Mix milk, flour, and eggs until smooth", "Pour into pan", "Spoon on apple filling",
                        "Bake at 400 degrees Fahrenheit for 30 minutes", "Serve immediately, it will fall"));
        Recipe recipe1 = new Recipe(11, "Pannenkoeken", recipeDetail1);
        recipes.add(recipe1);

        RecipeDetail recipeDetail2 = new RecipeDetail(new Date(), "Vegetarian", 8);
        recipeDetail2.getListOfIngredients().addAll(Arrays
                .asList("2 l. water ", "500 gr. split peas ", "2 onions ", "2 leeks ", "1 celeriac ", "2 potatoes ", "1 carrots ", "bunch of celery ",
                        "pepper and salt ", "150 grams of smoked tofu or vegetarian smoked sausage"));
        recipeDetail2.getCookingInstructions().addAll(Arrays
                .asList("Rinse the peas well and bring them to the boil in the water. Foam the top as the soup boils. ",
                        "In the meantime, finely chop the onion and the leek in rings. Peel the celeriac and potatoes and cut into cubes. Clean the carrot and cut into strips. Add the vegetables if the peas have cooked for about half an hour. ",
                        "Cook until the peas are cooked and the soup is thick (30 to 60 minutes). ",
                        "Heat the smoked sausage in a pan for the last 10 minutes, cut into slices and add at the end of the cooking time. If you use smoking tofu, cut it into cubes and let it cook with the soup for the last 10 minutes. ",
                        "Cut the celery finely and stir it just before serving by the soup. Season with salt and pepper.",
                        "Serve in large bowls with rye bread smeared with fresh cream cheese."));
        Recipe recipe2 = new Recipe(12, "Erwtensoep", recipeDetail2);
        recipes.add(recipe2);

        RecipeDetail recipeDetail3 = new RecipeDetail(new Date(), "Vegetarian", 12);
        recipeDetail3.getListOfIngredients().addAll(Arrays
                .asList("250g plain flour", "175g butter, softened", "80g caster sugar", "2 eggs (1½ for the pastry mixture, ½ for brushing the top)",
                        "1 teaspoon ground cinnamon"));
        recipeDetail3.getCookingInstructions().addAll(Arrays
                .asList("Mix the flour, softened butter, sugar, cinnamon and 1½ eggs in a bowl. Knead it with your hands to a consistent, smooth dough.",
                        "Roll out ¾ of the dough to cover the bottom and sides of a greased round (24cm) cake tin or spring form tin.",
                        "Preheat the oven to 170 C / Gas 3.",
                        "Peel, core and slice the apples. Mix this with 50g sugar, sultanas and cinnamon. Put this mixture into the prepared cake tin.",
                        "Roll out the remaining dough and cut into long strips, each about 1cm wide. Start with the longest strips and lay the first two in an X in the centre of the pie. Alternate horizontal and vertical strips, weaving them in an over-and-under pattern. Use the shortest strips for the edges of the lattice. If you're having trouble removing the dough from the work surface, roll the strips up like a rug and unroll them onto the pie. Press the ends of the strips firmly to the edge of the pie and trim away any excess dough with a knife. Brush with remaining (beaten) egg.",
                        "Bake for 60-65 minutes, or until pastry is light brown."));
        Recipe recipe3 = new Recipe(13, "Appeltaart", recipeDetail3);
        recipes.add(recipe3);

        RecipeDetail recipeDetail4 = new RecipeDetail(new Date(), "NonVegetarian", 14);
        recipeDetail4.getListOfIngredients().addAll(Arrays.asList(""));
        recipeDetail4.getCookingInstructions().addAll(Arrays.asList(""));
        Recipe recipe4 = new Recipe(14, "Bami Goreng", recipeDetail4);
        recipes.add(recipe4);

        RecipeDetail recipeDetail5 = new RecipeDetail(new Date(), "Vegetarian", 40);
        recipeDetail5.getListOfIngredients().addAll(Arrays
                .asList("1 liter of beef ragout", "5 sheets of gelatin (bag, 12 pieces)", "2 tbsp mustard", "14 slices of tiger bread white",
                        "175 g of wheat flour", "4 medium-sized eggs", "1½ liters of frying oil", "Put these ingredients on my list"));
        recipeDetail5.getCookingInstructions().addAll(Arrays
                .asList("Heat the ragout and soak the gelatine for 5 minutes in cold water. Squeeze out and allow to dissolve in the ragout. Add the mustard. Put the ragout in the roasting pan. Allow to cool to room temperature in 1 hour. Put in the refrigerator for 3 hours. Preheat the oven to 100 ° C. Roast the bread for 20 minutes in the oven. Let cool and grind in the food processor to coarse breadcrumbs.",
                        "Cut the thick ragout (salpicon) into 40 pieces and roll balls. Beat the eggs. Take the balls successively through the flour, the egg and breadcrumbs. Heat the oil in a deep fryer or large pan to 180 ° C. Deep fry 6-8 bitterballen in approx. 4 min. Golden brown. Drain on kitchen paper. Delicious with mustard."));
        Recipe recipe5 = new Recipe(15, "Bitterballen", recipeDetail5);
        recipes.add(recipe5);

        return recipes;
    }
}
