package com.assignment.cookrecipe.model;

import javax.validation.constraints.NotBlank;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
public class RecipeIngredient {

    private long id;

    @NotBlank
    private String ingredient;

    public RecipeIngredient(final long id, final String ingredient) {
        this.id = id;
        this.ingredient = ingredient;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        RecipeIngredient that = (RecipeIngredient) o;

        if (id != that.id)
            return false;
        return ingredient.equals(that.ingredient);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + ingredient.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "id=" + id +
                ", ingredient='" + ingredient + '\'' +
                '}';
    }
}
