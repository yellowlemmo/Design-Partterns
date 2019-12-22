package FactoryModel.AbatractFactoryModel;

import FactoryModel.AbatractFactoryModel.Class.Color;
import FactoryModel.AbatractFactoryModel.Class.Shap;

/**
 * @ClassName: AbstractFactory
 * @DESCRIPT: TODO 抽象工厂
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:43 PM
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String colorName);

    public abstract Shap getShap(String shapName);
}
