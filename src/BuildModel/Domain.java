package BuildModel;

import BuildModel.Meal.Meal;
import BuildModel.Meal.MealBuilder;

import javax.sound.midi.Soundbank;

/**
 * @ClassName: Domain
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 3:02 PM
 **/
public class Domain {

    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVegMeal = mealBuilder.preparNonVegMeal();
        System.out.println("NonVegMeal:");
        nonVegMeal.showItems();
        System.out.println("VegMeal:");
        Meal vegMeal = mealBuilder.preparVegMeal();
        vegMeal.showItems();
    }

}
