package BridgeModel.Capacity;

import BridgeModel.Additives.CoffeAdditives;

/**
 * @ClassName: SmaleCapacity
 * @DESCRIPT: TODO 小杯咖啡
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/11 5:11 PM
 **/
public class SmaleCapacity extends CoffeCapacity{
    public SmaleCapacity(CoffeAdditives additives) {
        super(additives);
    }

    @Override
    public void coffeOrder(int count) {
        System.out.println(String.format("咖啡 d% 小杯",count));
    }
}
