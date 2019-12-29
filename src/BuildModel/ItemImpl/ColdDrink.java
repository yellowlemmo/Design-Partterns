package BuildModel.ItemImpl;

import BuildModel.Item;
import BuildModel.PackEntity.Bottle;
import BuildModel.Packing;

/**
 * @ClassName: ColdDrink
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:44 PM
 **/
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
