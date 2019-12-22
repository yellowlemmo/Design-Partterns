package FactoryModel.AbatractFactoryModel.FactoryList;


import FactoryModel.AbatractFactoryModel.AbstractFactory;
import FactoryModel.AbatractFactoryModel.Class.Color;
import FactoryModel.AbatractFactoryModel.Class.Shap;
import FactoryModel.AbatractFactoryModel.ShapEntity.Circle;
import FactoryModel.AbatractFactoryModel.ShapEntity.Rectagngle;
import FactoryModel.AbatractFactoryModel.ShapEntity.Square;

/**
 * @ClassName: ShapFactory
 * @DESCRIPT: TODO 形状工厂
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:46 PM
 **/
public class ShapFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorName) {
        return null;
    }

    @Override
    public Shap getShap(String shapName) {
        if(shapName.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapName.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if(shapName.equalsIgnoreCase("RECTANGLE")){
            return new Rectagngle();
        }

        return null;
    }
}
