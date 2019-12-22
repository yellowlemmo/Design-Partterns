package FactoryModel.AbatractFactoryModel.ShapEntity;


import FactoryModel.AbatractFactoryModel.Class.Shap;

/**
 * @ClassName: Circle
 * @DESCRIPT: TODO 形状产品中的具体颜色是圆的产品
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:19 PM
 **/
public class Circle implements Shap {
    @Override
    public void draw() {
        System.out.println("I'm Circle!");
    }
}
