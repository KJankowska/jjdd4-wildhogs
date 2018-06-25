package com.infoshareacademy.jjdd4.wildhogs.app;

import com.infoshareacademy.jjdd4.wildhogs.logic.MealCreator;

public class Main {

    public static void main(String[] args) {
        new Configuration();

        MealCreator mealCreator = new MealCreator();

        for (String key: mealCreator.getMapOfMeals().keySet()) {
            System.out.println(key);
        }
    }
}
