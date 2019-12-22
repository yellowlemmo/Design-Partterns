package FactoryModel.AbatractFactoryModel.ColorEntity;

import FactoryModel.AbatractFactoryModel.Class.Color;

/**
 * @ClassName: Yellow
 * @DESCRIPT: TODO 颜色产品中的具体颜色是红色的产品
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:58 PM
 **/
public class Yellow implements Color {
    @Override
    public void fill() {
        System.out.println("I'm yellow");
    }
}
