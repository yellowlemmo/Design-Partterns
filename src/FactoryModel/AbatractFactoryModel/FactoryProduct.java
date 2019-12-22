package FactoryModel.AbatractFactoryModel;

import FactoryModel.AbatractFactoryModel.FactoryList.ColorFactory;
import FactoryModel.AbatractFactoryModel.FactoryList.ShapFactory;

/**
 * @ClassName: FactoryProduct
 * @DESCRIPT: TODO 生产工厂的工厂
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 5:03 PM
 **/
public class FactoryProduct {

    public static AbstractFactory getFactory(String factoryName){
        if(factoryName.equalsIgnoreCase("shap")){
            return new ShapFactory();
        }

        if(factoryName.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
