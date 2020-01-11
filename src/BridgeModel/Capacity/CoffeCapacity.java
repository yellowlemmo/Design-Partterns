package BridgeModel.Capacity;

import BridgeModel.Additives.CoffeAdditives;

/**
 * @ClassName: CoffeCapacity
 * @DESCRIPT: TODO 抽象咖啡容量 聚合咖啡口味 在初始化容量时注入口味
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/11 5:00 PM
 **/
public abstract class CoffeCapacity {
    protected CoffeAdditives additives;
    public CoffeCapacity(CoffeAdditives additives){
        this.additives = additives;
    }

    public abstract void coffeOrder(int count);
}
