package BridgeModel.Additives;

/**
 * @ClassName: MilkAdditives
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/11 4:57 PM
 **/
public class MilkAdditives implements CoffeAdditives{
    @Override
    public void addSomething() {
        System.out.println("加奶");
    }
}
