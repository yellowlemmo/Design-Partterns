package BuildModel.ColdDrink;

import BuildModel.ItemImpl.ColdDrink;

/**
 * @ClassName: Pepsi
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:51 PM
 **/
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 3.5f;
    }
}
