package BridgeModel;

import BridgeModel.Additives.MilkAdditives;
import BridgeModel.Capacity.CoffeCapacity;
import BridgeModel.Capacity.LargeCapacity;

/**
 * @ClassName: Domain
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/11 5:12 PM
 **/
public class Domain {
    public static void main(String[] args){
        CoffeCapacity coffe = new LargeCapacity(new MilkAdditives());
        coffe.coffeOrder(2);
    }
}
