package com.assignment.cookrecipe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
public class RecipeDetail {
    private Date dateOfCreation;
    private String typeOfDish;
    private int numberOfPeopleDishSuitableFor;
    private List<String> listOfIngredients;
    private List<String> cookingInstructions;

    public RecipeDetail(final Date dateOfCreation, final String typeOfDish, final int numberOfPeopleDishSuitableFor) {
        this.dateOfCreation = dateOfCreation;
        this.typeOfDish = typeOfDish;
        this.numberOfPeopleDishSuitableFor = numberOfPeopleDishSuitableFor;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeofDish(String typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public int getNumberOfPeopleDishSuitableFor() {
        return numberOfPeopleDishSuitableFor;
    }

    public void setNumberOfPeopleDishSuitableFor(int numberOfPeopleDishSuitableFor) {
        this.numberOfPeopleDishSuitableFor = numberOfPeopleDishSuitableFor;
    }

    public List<String> getListOfIngredients() {
        if (listOfIngredients == null) {
            listOfIngredients = new ArrayList<>();
        }
        return listOfIngredients;
    }

    public List<String> getCookingInstructions() {
        if (cookingInstructions == null) {
            cookingInstructions = new ArrayList<>();
        }
        return cookingInstructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        RecipeDetail that = (RecipeDetail) o;

        if (numberOfPeopleDishSuitableFor != that.numberOfPeopleDishSuitableFor)
            return false;
        if (!dateOfCreation.equals(that.dateOfCreation))
            return false;
        if (!typeOfDish.equals(that.typeOfDish))
            return false;
        if (!listOfIngredients.equals(that.listOfIngredients))
            return false;
        return cookingInstructions.equals(that.cookingInstructions);

    }

    @Override
    public int hashCode() {
        int result = dateOfCreation.hashCode();
        result = 31 * result + typeOfDish.hashCode();
        result = 31 * result + numberOfPeopleDishSuitableFor;
        result = 31 * result + listOfIngredients.hashCode();
        result = 31 * result + cookingInstructions.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RecipeDetail{" +
                "dateOfCreation=" + dateOfCreation +
                ", typeOfDish='" + typeOfDish + '\'' +
                ", numberOfPeopleDishSuitableFor=" + numberOfPeopleDishSuitableFor +
                ", listOfIngredients=" + listOfIngredients +
                ", cookingInstructions=" + cookingInstructions +
                '}';
    }
}
