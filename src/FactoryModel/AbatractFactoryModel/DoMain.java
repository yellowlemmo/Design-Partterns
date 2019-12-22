package FactoryModel.AbatractFactoryModel;

import FactoryModel.AbatractFactoryModel.Class.Color;
import FactoryModel.AbatractFactoryModel.Class.Shap;

import java.awt.*;

/**
 * @ClassName: DoMain
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 5:01 PM
 **/
public class DoMain {

    public static void main(String[] args){
        AbstractFactory shapFactory = FactoryProduct.getFactory("shap");
        Shap shap = shapFactory.getShap("circle");
        shap.draw();

        AbstractFactory colorFctory = FactoryProduct.getFactory("color");
        Color color = colorFctory.getColor("red");
        color.fill();

    }
}
