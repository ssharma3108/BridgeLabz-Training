package mealgenerator;
//meal plan interface
interface MealPlan{
    String getMealType();
    int getCalories();
    void prepareMeal();
}
//concrete meal plans
class VegetarianMeal implements MealPlan{
    public String getMealType(){
        return "Vegetarian";
    }
    public int getCalories(){
        return 500;
    }
    public void prepareMeal(){
        System.out.println("Preparing vegetarian");
    }
}
class VeganMeal implements MealPlan{
    public String getMealType(){
        return "Vegan";
    }
    public int getCalories(){
        return 450;
    }
    public void prepareMeal(){
        System.out.println("Preparing vegan meal");
    }
}
class KetoMeal implements MealPlan{
    public String getMealType(){
        return "Keto";
    }
    public int getCalories(){
        return 600;
    }
    public void prepareMeal(){
        System.out.println("Preparing keto meal");
    }
}
class HighProteinMeal implements MealPlan{
    public String getMealType(){
        return "High-Protein";
    }
    public int getCalories(){
        return 700;
    }
    public void prepareMeal(){
        System.out.println("Preparing high-protein meal");
    }
}
// generic meal class
class Meal<T extends MealPlan>{
    private T mealPlan;
    public Meal(T mealPlan){
        this.mealPlan = mealPlan;
    }
    public void generateMeal(){
        System.out.println("\nMeal Type : "+mealPlan.getMealType());
        System.out.println("Calories : "+mealPlan.getCalories());
        mealPlan.prepareMeal();
    }
    public T getMealPlan(){
        return mealPlan;
    }
}
//meal generator
class MealGenerator{
    //generic method with bounded type parameter
    public static <T extends MealPlan> Meal<T> createMealPlan(T mealPlan){
        if (mealPlan==null){
            throw new IllegalArgumentException("Invalid Meal Plan");
        }
        return new Meal<>(mealPlan);
    }
}