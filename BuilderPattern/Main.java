package BuilderPattern;

public class Main {

    public static void main(String[] args) {

        MealBuilder mealBuilder=new MealBuilder();

        Meal nonVegMeal=mealBuilder.prepareNonvegMeal();

        nonVegMeal.showItem();
        System.out.println(nonVegMeal.calculateCost());

        Meal VegMeal=mealBuilder.prepareVegMeal();

        VegMeal.showItem();
        System.out.println(VegMeal.calculateCost());


    }

}
