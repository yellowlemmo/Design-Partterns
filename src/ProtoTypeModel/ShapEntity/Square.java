package ProtoTypeModel.ShapEntity;


import ProtoTypeModel.Shape;
import ProtoTypeModel.ShapeInterface;

/**
 * @ClassName: Square
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/30 8:45 PM
 **/
public class Square extends Shape implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("I'm Square");
    }
}
