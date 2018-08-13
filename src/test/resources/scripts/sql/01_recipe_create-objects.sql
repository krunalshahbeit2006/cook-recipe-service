CREATE TABLE "COOK_RECIPE"
  (
    "ID"          NUMBER NOT NULL ENABLE,
    "NAME"        VARCHAR2(100 BYTE) NOT NULL ENABLE,
    "DISH_TYPE"   VARCHAR2(15 BYTE) NOT NULL ENABLE,
    /*"CREATE_DATE" DATE NOT NULL ENABLE,
    "MODIFY_DATE" DATE NOT NULL ENABLE,*/
    CONSTRAINT "COOK_RECIPE_PK" PRIMARY KEY ("ID"),
    CONSTRAINT "COOK_RECIPE_UK1" UNIQUE ("NAME")
  );

CREATE INDEX "COOK_RECIPE_INDEX1" ON "COOK_RECIPE" ("DISH_TYPE");

/*CREATE INDEX "COOK_RECIPE_INDEX2" ON "COOK_RECIPE" ("CREATE_DATE");

CREATE INDEX "COOK_RECIPE_INDEX3" ON "COOK_RECIPE" ("MODIFY_DATE");*/

/*CREATE SEQUENCE "SEQ_COOK_RECIPE" INCREMENT BY 1 START WITH 1 MAXVALUE 999 MINVALUE 1 NOCACHE;*/


CREATE TABLE "COOK_RECIPE_DETAIL"
  (
    "ID"            NUMBER NOT NULL ENABLE,
    "RECIPE_ID"     NUMBER NOT NULL ENABLE,
    "CREATION_DATE" DATE NOT NULL ENABLE,
    "SUITABLE_FOR"  NUMBER NOT NULL ENABLE,
    /*"CREATE_DATE"   DATE NOT NULL ENABLE,
    "MODIFY_DATE"   DATE NOT NULL ENABLE,*/
    CONSTRAINT "COOK_RECIPE_DETAIL_PK" PRIMARY KEY ("ID"),
    CONSTRAINT "COOK_RECIPE_DETAIL_FK1" FOREIGN KEY ("ID") REFERENCES "COOK_RECIPE" ("ID") ON
  DELETE CASCADE ENABLE
  );

CREATE INDEX "COOK_RECIPE_DETAIL_INDEX1" ON "COOK_RECIPE_DETAIL" ("RECIPE_ID") ;

CREATE INDEX "COOK_RECIPE_DETAIL_INDEX2" ON "COOK_RECIPE_DETAIL" ("CREATION_DATE");

CREATE INDEX "COOK_RECIPE_DETAIL_INDEX3" ON "COOK_RECIPE_DETAIL" ("SUITABLE_FOR");

/*CREATE INDEX "COOK_RECIPE_DETAIL_INDEX4" ON "COOK_RECIPE_DETAIL" ("CREATE_DATE");

CREATE INDEX "COOK_RECIPE_DETAIL_INDEX5" ON "COOK_RECIPE_DETAIL" ("MODIFY_DATE");*/

/*CREATE SEQUENCE "SEQ_COOK_RECIPE_DETAIL" INCREMENT BY 1 START WITH 1 MAXVALUE 999 MINVALUE 1 NOCACHE;*/


CREATE TABLE "COOK_RECIPE_INGREDIENT"
  (
    "ID"          NUMBER NOT NULL ENABLE,
    "RECIPE_ID"   NUMBER NOT NULL ENABLE,
    "INGREDIENT"  VARCHAR2(100 BYTE) NOT NULL ENABLE,
    /*"CREATE_DATE" DATE NOT NULL ENABLE,
    "MODIFY_DATE" DATE NOT NULL ENABLE,*/
    CONSTRAINT "COOK_RECIPE_INGREDIENT_PK" PRIMARY KEY ("ID"),
    CONSTRAINT "COOK_RECIPE_INGREDIENT_FK1" FOREIGN KEY ("RECIPE_ID") REFERENCES "COOK_RECIPE" ("ID") ON
  DELETE CASCADE ENABLE
  );

/*CREATE INDEX "COOK_RECIPE_INGREDIENT_INDEX1" ON "COOK_RECIPE_INGREDIENT" ("CREATE_DATE");

CREATE INDEX "COOK_RECIPE_INGREDIENT_INDEX2" ON "COOK_RECIPE_INGREDIENT" ("MODIFY_DATE");*/

/*CREATE SEQUENCE "SEQ_COOK_RECIPE_INGREDIENT" INCREMENT BY 1 START WITH 1 MAXVALUE 999 MINVALUE 1 NOCACHE;*/


CREATE TABLE "COOK_RECIPE_INSTRUCTION"
  (
    "ID"          NUMBER NOT NULL ENABLE,
    "RECIPE_ID"   NUMBER NOT NULL ENABLE,
    "INSTRUCTION" VARCHAR2(250 BYTE) NOT NULL ENABLE,
    /*"CREATE_DATE" DATE NOT NULL ENABLE,
    "MODIFY_DATE" DATE NOT NULL ENABLE,*/
    CONSTRAINT "COOK_RECIPE_INSTRUCTION_PK" PRIMARY KEY ("ID"),
    CONSTRAINT "COOK_RECIPE_INSTRUCTION_FK1" FOREIGN KEY ("RECIPE_ID") REFERENCES "COOK_RECIPE" ("ID") ON
  DELETE CASCADE ENABLE
  );

/*
CREATE INDEX "COOK_RECIPE_INSTRUCTION_INDEX1" ON "COOK_RECIPE_INSTRUCTION" ("CREATE_DATE");

CREATE INDEX "COOK_RECIPE_INSTRUCTION_INDEX2" ON "COOK_RECIPE_INSTRUCTION" ("MODIFY_DATE");*/

/*CREATE SEQUENCE "SEQ_COOK_RECIPE_INSTRUCTION" INCREMENT BY 1 START WITH 1 MAXVALUE 999 MINVALUE 1 NOCACHE;*/