package com.assignment.cookrecipe.dao;

import com.assignment.cookrecipe.model.Recipe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
@Repository(value = "recipeDAO")
public class RecipeDAOImpl implements RecipeDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipeDAOImpl.class);

    @PersistenceContext
    private EntityManager em;

    @Override
    public Set<Recipe> findAll() {

        List<Recipe> recipesList;
        Set<Recipe> recipesSet = null;

        try {

            recipesList = (List<Recipe>) this.em.createQuery("FROM Recipe AS r").getResultList();
            recipesSet = new LinkedHashSet<>(recipesList);

        } catch (Exception e) {
            LOGGER.error("Exception: {}", e);

        } finally {
            LOGGER.debug("recipesSet: {}", recipesSet);
        }
        return recipesSet;
    }
}
