package FactoryModel.CommonFactoryModel;

import com.sun.scenario.effect.impl.hw.ShaderSource;

/**
 * @ClassName: Circle
 * @DESCRIPT: TODO 定义圆形实现形状接口
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:19 PM
 **/
public class Circle implements Shap {
    @Override
    public void draw() {
        System.out.println("I'm Circle!");
    }
}
