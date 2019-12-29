package BuildModel.PackEntity;

import BuildModel.Packing;

/**
 * @ClassName: Wrapper
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/29 2:38 PM
 **/
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
