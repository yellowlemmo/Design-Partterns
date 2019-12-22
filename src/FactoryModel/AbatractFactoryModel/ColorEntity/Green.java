package FactoryModel.AbatractFactoryModel.ColorEntity;

import FactoryModel.AbatractFactoryModel.Class.Color;

/**
 * @ClassName: Green
 * @DESCRIPT: TODO 颜色产品中的具体颜色是绿色的产品
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:57 PM
 **/
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("I'm green");
    }
}
