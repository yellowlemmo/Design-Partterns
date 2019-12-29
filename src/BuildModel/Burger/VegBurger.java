package BuildModel.Burger;

import BuildModel.ItemImpl.Burger;

/**
 * @ClassName: VegBurger
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:47 PM
 **/
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
