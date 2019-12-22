package FactoryModel.CommonFactoryModel;

/**
 * @ClassName: Square
 * @DESCRIPT: TODO 定义方形实现形状接口
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:20 PM
 **/
public class Square implements Shap{
    @Override
    public void draw() {
        System.out.println("I'm Square!");
    }
}
