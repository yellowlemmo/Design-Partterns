package BuildModel.ColdDrink;

import BuildModel.ItemImpl.ColdDrink;

/**
 * @ClassName: Coke
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:50 PM
 **/
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
