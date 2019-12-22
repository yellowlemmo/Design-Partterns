package FactoryModel.CommonFactoryModel;

/**
 * @ClassName: DoMain
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/22 4:25 PM
 **/
public class DoMain {

    public static void main(String[] args){
        ShapFactory shapFactory = new ShapFactory();

        Shap shap1 = shapFactory.getShap("circle");
        shap1.draw();

        Shap shap2 = shapFactory.getShap("square");
        shap2.draw();

        Shap shap3 = shapFactory.getShap("rectangle");
        shap3.draw();
    }
}
