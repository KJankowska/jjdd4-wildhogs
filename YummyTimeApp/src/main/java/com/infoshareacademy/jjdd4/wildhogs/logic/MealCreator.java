package com.infoshareacademy.jjdd4.wildhogs.logic;

import com.infoshareacademy.jjdd4.wildhogs.app.Configuration;
import com.infoshareacademy.jjdd4.wildhogs.data.Recipe;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;

public class MealCreator {

    private Map<String, Recipe> mapOfMeals;

    public MealCreator() {

        mapOfMeals = new LinkedHashMap<>();

        JSONObject jsonObject = JSONProvider.read(new Configuration());
        JSONArray recipesArray = (JSONArray) jsonObject.get("recipes");

        for (Object recipe : recipesArray) {

            Recipe recipeCreated = RecipesProviderFromJSON.creator((JSONObject) recipe);

            if (recipeCreated != null) {
                mapOfMeals.put(recipeCreated.getName(), recipeCreated);
            }
        }
    }

    public Map<String, Recipe> getMapOfMeals() {
        return mapOfMeals;
    }

}
