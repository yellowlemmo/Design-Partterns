package BridgeModel.Capacity;

import BridgeModel.Additives.CoffeAdditives;

/**
 * @ClassName: LargeCapacity
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/11 5:07 PM
 **/
public class LargeCapacity extends CoffeCapacity{
    public LargeCapacity(CoffeAdditives additives) {
        super(additives);
    }

    @Override
    public void coffeOrder(int count) {
        additives.addSomething();
        System.out.println(String.format("%s咖啡%d大杯",additives.getClass().getSimpleName(),count));
    }
}
