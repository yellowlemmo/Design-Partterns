package BuildModel.Meal;

import BuildModel.Burger.ChickenBurger;
import BuildModel.Burger.VegBurger;
import BuildModel.ColdDrink.Coke;
import BuildModel.ColdDrink.Pepsi;

/**
 * @ClassName: MealBuilder
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:59 PM
 **/
public class MealBuilder {

    public Meal preparVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal preparNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
