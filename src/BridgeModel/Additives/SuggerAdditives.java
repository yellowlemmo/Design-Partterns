package BridgeModel.Additives;

/**
 * @ClassName: SuggerAdditives
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/11 4:58 PM
 **/
public class SuggerAdditives implements CoffeAdditives{
    @Override
    public void addSomething() {
        System.out.println("加糖");
    }
}
