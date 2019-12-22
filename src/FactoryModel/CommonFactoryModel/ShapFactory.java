package FactoryModel.CommonFactoryModel;

/**
 * @ClassName: ShapFactory
 * @DESCRIPT: TODO 生产形状的工厂类
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:22 PM
 **/
public class ShapFactory {

    public Shap getShap(String shapName){
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
