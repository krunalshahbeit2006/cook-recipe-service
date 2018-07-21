package com.assignment.cookrecipe.model;

import javax.validation.constraints.NotBlank;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
public class RecipeInstruction {

    private long id;

    @NotBlank
    private String instruction;

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
