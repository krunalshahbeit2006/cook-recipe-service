package com.assignment.cookrecipe.model;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
public class Recipe {
    private long id;
    private String name;
    private RecipeDetail recipeDetail;

    public Recipe(final long id, final String name, final RecipeDetail recipeDetail) {
        this.id = id;
        this.name = name;
        this.recipeDetail = recipeDetail;
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

    public RecipeDetail getRecipeDetail() {
        return recipeDetail;
    }

    public void setRecipeDetail(RecipeDetail recipeDetail) {
        this.recipeDetail = recipeDetail;
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
        return recipeDetail != null ? recipeDetail.equals(recipe.recipeDetail) : recipe.recipeDetail == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + (recipeDetail != null ? recipeDetail.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", recipeDetail=" + recipeDetail +
                '}';
    }
}
