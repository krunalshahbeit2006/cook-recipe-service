INSERT INTO COOK_RECIPE(ID, NAME, DISH_TYPE) VALUES (11, 'Pannenkoeken', 'Vegetarian');
INSERT INTO COOK_RECIPE(ID, NAME, DISH_TYPE) VALUES (12, 'Erwtensoep', 'Vegetarian');
INSERT INTO COOK_RECIPE(ID, NAME, DISH_TYPE) VALUES (13, 'Appeltaart', 'Vegetarian');
INSERT INTO COOK_RECIPE(ID, NAME, DISH_TYPE) VALUES (14, 'Bami Goreng', 'Non-vegetarian');
INSERT INTO COOK_RECIPE(ID, NAME, DISH_TYPE) VALUES (15, 'Bitterballen', 'Vegetarian');


INSERT INTO COOK_RECIPE_DETAIL(ID, RECIPE_ID, CREATION_DATE, SUITABLE_FOR) VALUES (11, 11, CURRENT_DATE, 2);
INSERT INTO COOK_RECIPE_DETAIL(ID, RECIPE_ID, CREATION_DATE, SUITABLE_FOR) VALUES (12, 12, CURRENT_DATE, 8);
INSERT INTO COOK_RECIPE_DETAIL(ID, RECIPE_ID, CREATION_DATE, SUITABLE_FOR) VALUES (13, 13, CURRENT_DATE, 12);
INSERT INTO COOK_RECIPE_DETAIL(ID, RECIPE_ID, CREATION_DATE, SUITABLE_FOR) VALUES (14, 14, CURRENT_DATE, 14);
INSERT INTO COOK_RECIPE_DETAIL(ID, RECIPE_ID, CREATION_DATE, SUITABLE_FOR) VALUES (15, 15, CURRENT_DATE, 40);


INSERT INTO COOK_RECIPE_INGREDIENT(ID, RECIPE_ID, INGREDIENT) VALUES (11, 11, '1/4 cup butter shopping list');
INSERT INTO COOK_RECIPE_INGREDIENT(ID, RECIPE_ID, INGREDIENT) VALUES (12, 11, '3/4 cup milk');
INSERT INTO COOK_RECIPE_INGREDIENT(ID, RECIPE_ID, INGREDIENT) VALUES (13, 11, '3/4 cup flour');
INSERT INTO COOK_RECIPE_INGREDIENT(ID, RECIPE_ID, INGREDIENT) VALUES (14, 11, '3 eggs');
INSERT INTO COOK_RECIPE_INGREDIENT(ID, RECIPE_ID, INGREDIENT) VALUES (15, 11, '1 cup apple filling (or another flavor)');


INSERT INTO COOK_RECIPE_INSTRUCTION(ID, RECIPE_ID, INSTRUCTION) VALUES (11, 11, 'Melt butter in an 8x8 inch pan');
INSERT INTO COOK_RECIPE_INSTRUCTION(ID, RECIPE_ID, INSTRUCTION) VALUES (12, 11, 'Mix milk, flour, and eggs until smooth');
INSERT INTO COOK_RECIPE_INSTRUCTION(ID, RECIPE_ID, INSTRUCTION) VALUES (13, 11, 'Pour into pan');
INSERT INTO COOK_RECIPE_INSTRUCTION(ID, RECIPE_ID, INSTRUCTION) VALUES (14, 11, 'Spoon on apple filling');
INSERT INTO COOK_RECIPE_INSTRUCTION(ID, RECIPE_ID, INSTRUCTION) VALUES (15, 11, 'Bake at 400 degrees Fahrenheit for 30 minutes');
INSERT INTO COOK_RECIPE_INSTRUCTION(ID, RECIPE_ID, INSTRUCTION) VALUES (16, 11, 'Serve immediately, it will fall');