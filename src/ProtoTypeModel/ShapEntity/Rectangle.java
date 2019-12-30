package ProtoTypeModel.ShapEntity;

import ProtoTypeModel.Shape;
import ProtoTypeModel.ShapeInterface;

/**
 * @ClassName: Rectangle
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/30 8:46 PM
 **/
public class Rectangle extends Shape implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("I'm rectangle");
    }
}
