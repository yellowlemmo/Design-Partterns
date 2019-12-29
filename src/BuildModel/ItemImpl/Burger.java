package BuildModel.ItemImpl;

import BuildModel.Item;
import BuildModel.PackEntity.Wrapper;
import BuildModel.Packing;

/**
 * @ClassName: Burger
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:40 PM
 **/
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
