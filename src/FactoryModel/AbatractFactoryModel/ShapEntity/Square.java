package FactoryModel.AbatractFactoryModel.ShapEntity;


import FactoryModel.AbatractFactoryModel.Class.Shap;

/**
 * @ClassName: Square
 * @DESCRIPT: TODO 形状产品中的具体颜色是正方形的产品
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:20 PM
 **/
public class Square implements Shap {
    @Override
    public void draw() {
        System.out.println("I'm Square!");
    }
}
