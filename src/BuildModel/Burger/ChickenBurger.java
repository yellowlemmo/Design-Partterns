package BuildModel.Burger;

import BuildModel.ItemImpl.Burger;

/**
 * @ClassName: ChickenBurger
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:49 PM
 **/
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
