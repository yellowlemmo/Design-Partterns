package BuildModel.PackEntity;

import BuildModel.Packing;

/**
 * @ClassName: Bottle
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:38 PM
 **/
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
