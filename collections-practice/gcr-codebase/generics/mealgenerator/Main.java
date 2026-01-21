package mealgenerator;

import java.util.*;

//main class
public class Main {
    public static void main(String[] args) {
        // creating different meal plans dynamically
        Meal<VegetarianMeal> vegMeal = MealGenerator.createMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = MealGenerator.createMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoMeal = MealGenerator.createMealPlan(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = MealGenerator.createMealPlan(new HighProteinMeal());
        // generate meals
        vegMeal.generateMeal();
        veganMeal.generateMeal();
        ketoMeal.generateMeal();
        proteinMeal.generateMeal();
    }
}