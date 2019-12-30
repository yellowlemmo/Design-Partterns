package ProtoTypeModel.ShapEntity;

import ProtoTypeModel.Shape;
import ProtoTypeModel.ShapeInterface;

/**
 * @ClassName: Circle
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/30 8:58 PM
 **/
public class Circle extends Shape implements ShapeInterface {

    @Override
    public void draw() {
        System.out.println("I'm Circle");
    }
}
