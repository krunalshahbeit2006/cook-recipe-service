package com.assignment.cookrecipe.model;

import javax.validation.constraints.NotBlank;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
public class Recipe {

    private long id;

    @NotBlank
    private String name;

    @NotBlank
    private String typeOfDish;

    private Set<RecipeDetail> details;

    private Set<RecipeIngredient> ingredients;

    private Set<RecipeInstruction> instructions;

    public Recipe(final long id, final String name, final String typeOfDish) {
        this.id = id;
        this.name = name;
        this.typeOfDish = typeOfDish;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeOfDish(String typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public Set<RecipeDetail> getDetails() {
        this.details = (this.details == null) ? new LinkedHashSet<>() : this.details;

        return this.details;
    }

    public Set<RecipeIngredient> getIngredients() {
        this.ingredients = (this.ingredients == null) ? new LinkedHashSet<>() : this.ingredients;

        return ingredients;
    }

    public Set<RecipeInstruction> getInstructions() {
        this.instructions = (this.instructions == null) ? new LinkedHashSet<>() : this.instructions;

        return this.instructions;
    }

    public boolean addDetail(RecipeDetail detail) {
        return getDetails().add(detail);
    }

    public boolean addIngredient(RecipeIngredient ingredient) {
        return getIngredients().add(ingredient);
    }

    public boolean addInstructions(RecipeInstruction instruction) {
        return getInstructions().add(instruction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Recipe recipe = (Recipe) o;

        if (id != recipe.id)
            return false;
        if (!name.equals(recipe.name))
            return false;
        if (!typeOfDish.equals(recipe.typeOfDish))
            return false;
        if (!details.equals(recipe.details))
            return false;
        if (!ingredients.equals(recipe.ingredients))
            return false;
        return instructions.equals(recipe.instructions);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + typeOfDish.hashCode();
        result = 31 * result + details.hashCode();
        result = 31 * result + ingredients.hashCode();
        result = 31 * result + instructions.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeOfDish='" + typeOfDish + '\'' +
                ", details='" + details + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
