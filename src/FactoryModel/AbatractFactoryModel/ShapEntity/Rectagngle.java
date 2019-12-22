package FactoryModel.AbatractFactoryModel.ShapEntity;


import FactoryModel.AbatractFactoryModel.Class.Shap;

/**
 * @ClassName: Rectagngle
 * @DESCRIPT: TODO 形状产品中的具体颜色是长方形的产品
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:21 PM
 **/
public class Rectagngle implements Shap {
    @Override
    public void draw() {
        System.out.println("I'm Rectagngle!");
    }
}
