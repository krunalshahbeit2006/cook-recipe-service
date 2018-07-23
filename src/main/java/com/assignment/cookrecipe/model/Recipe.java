package com.assignment.cookrecipe.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
@Entity(name = "Recipe")
@Table(name = "COOK_RECIPE",
        indexes = { @Index(name = "COOK_RECIPE_INDEX1", columnList = "DISH_TYPE") })
public class Recipe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", updatable = false)
    private long id;

    @NotBlank
    @Column(name = "NAME", nullable = false, unique = true, updatable = false, length = 100)
    private String name;

    @NotBlank
    @Column(name = "DISH_TYPE", nullable = false, length = 15)
    private String typeOfDish;

    @OneToMany(mappedBy = "recipe", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @OrderBy("ID ASC")
    private Set<RecipeDetail> details;

    @OneToMany(mappedBy = "recipe", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @OrderBy("ID ASC")
    private Set<RecipeIngredient> ingredients;

    @OneToMany(mappedBy = "recipe", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @OrderBy("ID ASC")
    private Set<RecipeInstruction> instructions;

    public Recipe() {

    }

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
