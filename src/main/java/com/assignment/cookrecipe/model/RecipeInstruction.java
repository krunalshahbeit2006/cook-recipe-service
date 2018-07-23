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
@Entity(name = "RecipeInstruction")
@Table(name = "COOK_RECIPE_INSTRUCTION")
public class RecipeInstruction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", updatable = false)
    private long id;

    @NotBlank
    @Column(name = "INSTRUCTION", nullable = false, length = 250)
    private String instruction;

    @NotBlank
    @ManyToOne(targetEntity = Recipe.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "RECIPE_ID", nullable = false)
    private Recipe recipe;

    public RecipeInstruction() {

    }

    public RecipeInstruction(final long id, final String instruction) {
        this.id = id;
        this.instruction = instruction;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        RecipeInstruction that = (RecipeInstruction) o;

        if (id != that.id)
            return false;
        return instruction.equals(that.instruction);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + instruction.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "id=" + id +
                ", instruction='" + instruction + '\'' +
                '}';
    }
}
