package com.assignment.cookrecipe.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
@Entity(name = "RecipeIngredient")
@Table(name = "COOK_RECIPE_INGREDIENT")
public class RecipeIngredient implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @NotBlank
    @Column(name = "INGREDIENT", nullable = false, length = 100)
    private String ingredient;

    @NotBlank
    @ManyToOne(targetEntity = Recipe.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "RECIPE_ID", nullable = false)
    private Recipe recipe;

    public RecipeIngredient() {

    }

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
