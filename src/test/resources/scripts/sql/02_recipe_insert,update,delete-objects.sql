DECLARE

BEGIN

  -- Recipe 1 --
  INSERT INTO cook_recipe(id, name, dish_type) VALUES (11, 'Pannenkoeken', 'Vegetarian');

  INSERT INTO cook_recipe_detail(id, recipe_id, creation_date, suitable_for) VALUES (11, 11, CURRENT_DATE, 2);

  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (11, 11, '1/4 cup butter shopping list');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (12, 11, '3/4 cup milk');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (13, 11, '3/4 cup flour');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (14, 11, '3 eggs');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (15, 11, '1 cup apple filling (or another flavor)');

  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (11, 11, 'Melt butter in an 8x8 inch pan');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (12, 11, 'Mix milk, flour, and eggs until smooth');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (13, 11, 'Pour into pan');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (14, 11, 'Spoon on apple filling');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (15, 11, 'Bake at 400 degrees Fahrenheit for 30 minutes');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (16, 11, 'Serve immediately, it will fall');


  -- Recipe 2 --
  INSERT INTO cook_recipe(id, name, dish_type) VALUES (12, 'Erwtensoep', 'Vegetarian');

  INSERT INTO cook_recipe_detail(id, recipe_id, creation_date, suitable_for) VALUES (12, 12, CURRENT_DATE, 8);

  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (21, 12, '2 l. water');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (22, 12, '500 gr. split peas');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (23, 12, '2 onions');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (24, 12, '2 leeks');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (25, 12, '1 celeriac');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (26, 12, '2 potatoes');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (27, 12, '1 carrots');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (28, 12, 'bunch of celery');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (29, 12, 'pepper and salt');
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (30, 12, '150 grams of smoked tofu or vegetarian smoked sausage');

  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (21, 12, 'Rinse the peas well and bring them to the boil in the water. Foam the top as the soup boils.');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (22, 12, 'In the meantime, finely chop the onion and the leek in rings. Peel the celeriac and potatoes and cut into cubes. Clean the carrot and cut into strips. Add the vegetables if the peas have cooked for about half an hour.');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (23, 12, 'Cook until the peas are cooked and the soup is thick (30 to 60 minutes).');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (24, 12, 'Heat the smoked sausage in a pan for the last 10 minutes, cut into slices and add at the end of the cooking time. If you use smoking tofu, cut it into cubes and let it cook with the soup for the last 10 minutes.');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (25, 12, 'Cut the celery finely and stir it just before serving by the soup. Season with salt and pepper.');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (26, 12, 'Serve in large bowls with rye bread smeared with fresh cream cheese.');


  -- Recipe 3 --
  INSERT INTO cook_recipe(id, name, dish_type) VALUES (13, 'Appeltaart', 'Vegetarian');
  INSERT INTO cook_recipe_detail(id, recipe_id, creation_date, suitable_for) VALUES (13, 13, CURRENT_DATE, 12);
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (31, 13, 'test ingredient');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (31, 13, 'test instruction');


  -- Recipe 4 --
  INSERT INTO cook_recipe(id, name, dish_type) VALUES (14, 'Bami Goreng', 'Non-vegetarian');
  INSERT INTO cook_recipe_detail(id, recipe_id, creation_date, suitable_for) VALUES (14, 14, CURRENT_DATE, 14);
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (41, 14, 'test ingredient');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (41, 14, 'test instruction');


  -- Recipe 5 --
  INSERT INTO cook_recipe(id, name, dish_type) VALUES (15, 'Bitterballen', 'Vegetarian');
  INSERT INTO cook_recipe_detail(id, recipe_id, creation_date, suitable_for) VALUES (15, 15, CURRENT_DATE, 40);
  INSERT INTO cook_recipe_ingredient(id, recipe_id, ingredient) VALUES (51, 15, 'test ingredient');
  INSERT INTO cook_recipe_instruction(id, recipe_id, instruction) VALUES (51, 15, 'test instruction');

  COMMIT;

END;