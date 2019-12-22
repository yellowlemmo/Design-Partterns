package FactoryModel.AbatractFactoryModel.FactoryList;

import FactoryModel.AbatractFactoryModel.AbstractFactory;
import FactoryModel.AbatractFactoryModel.Class.Color;
import FactoryModel.AbatractFactoryModel.ColorEntity.Green;
import FactoryModel.AbatractFactoryModel.ColorEntity.Red;
import FactoryModel.AbatractFactoryModel.ColorEntity.Yellow;
import FactoryModel.AbatractFactoryModel.Class.Shap;

/**
 * @ClassName: ColorEntity
 * @DESCRIPT: TODO 颜色工厂
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:46 PM
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorName) {
        if(colorName.equalsIgnoreCase("green")){
            return new Green();
        }
        if(colorName.equalsIgnoreCase("red")){
            return new Red();
        }
        if(colorName.equalsIgnoreCase("yellow")){
            return new Yellow();
        }
        return null;
    }

    @Override
    public Shap getShap(String shapName) {
        return null;
    }
}
