package com.assignment.cookrecipe.model;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
public class RecipeDetail {

    private long id;

    @NotBlank
    private Date dateOfCreation;

    @NotBlank
    private int numberOfPeopleDishSuitableFor;

    public RecipeDetail(final long id, final Date dateOfCreation, final int numberOfPeopleDishSuitableFor) {
        this.id = id;
        this.dateOfCreation = dateOfCreation;
        this.numberOfPeopleDishSuitableFor = numberOfPeopleDishSuitableFor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public int getNumberOfPeopleDishSuitableFor() {
        return numberOfPeopleDishSuitableFor;
    }

    public void setNumberOfPeopleDishSuitableFor(int numberOfPeopleDishSuitableFor) {
        this.numberOfPeopleDishSuitableFor = numberOfPeopleDishSuitableFor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        RecipeDetail that = (RecipeDetail) o;

        if (id != that.id)
            return false;
        if (numberOfPeopleDishSuitableFor != that.numberOfPeopleDishSuitableFor)
            return false;
        return dateOfCreation.equals(that.dateOfCreation);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + dateOfCreation.hashCode();
        result = 31 * result + numberOfPeopleDishSuitableFor;
        return result;
    }

    @Override
    public String toString() {
        return "RecipeDetail{" +
                "id=" + id +
                ", dateOfCreation=" + dateOfCreation +
                ", numberOfPeopleDishSuitableFor=" + numberOfPeopleDishSuitableFor +
                '}';
    }
}
