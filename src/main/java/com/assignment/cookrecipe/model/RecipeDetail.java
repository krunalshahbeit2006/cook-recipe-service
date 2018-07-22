package com.assignment.cookrecipe.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
@Entity(name = "RecipeDetail")
@Table(name = "COOK_RECIPE_DETAIL",
        indexes = { @Index(name = "COOK_RECIPE_DETAIL_INDEX1", columnList = "RECIPE_ID"),
                @Index(name = "COOK_RECIPE_DETAIL_INDEX2", columnList = "CREATION_DATE"),
                @Index(name = "COOK_RECIPE_DETAIL_INDEX3", columnList = "SUITABLE_FOR") })
public class RecipeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @NotBlank
    @Column(name = "CREATION_DATE", nullable = false)
    private Date dateOfCreation;

    @NotBlank
    @Column(name = "SUITABLE_FOR", nullable = false)
    private int numberOfPeopleDishSuitableFor;

    @NotBlank
    @ManyToOne(targetEntity = Recipe.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "RECIPE_ID", nullable = false)
    private Recipe recipe;

    public RecipeDetail() {

    }

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
