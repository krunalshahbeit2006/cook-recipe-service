TRUNCATE TABLE COOK_RECIPE_INSTRUCTION DROP STORAGE;
DROP TABLE COOK_RECIPE_INSTRUCTION CASCADE CONSTRAINTS PURGE;

TRUNCATE TABLE COOK_RECIPE_INGREDIENT DROP STORAGE;
DROP TABLE COOK_RECIPE_INGREDIENT CASCADE CONSTRAINTS PURGE;

TRUNCATE TABLE COOK_RECIPE_DETAIL DROP STORAGE;
DROP TABLE COOK_RECIPE_DETAIL CASCADE CONSTRAINTS PURGE;

TRUNCATE TABLE COOK_RECIPE DROP STORAGE;
DROP TABLE COOK_RECIPE CASCADE CONSTRAINTS PURGE;