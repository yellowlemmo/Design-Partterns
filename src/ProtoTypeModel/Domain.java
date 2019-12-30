package ProtoTypeModel;

import ProtoTypeModel.GenerateObject.ShapCache;
import ProtoTypeModel.GenerateObject.ShapeFactory;
import ProtoTypeModel.ShapEntity.Circle;

/**
 * @ClassName: Domain
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/30 9:03 PM
 **/
public class Domain {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapCache.loadObject();
//        Shape shape = ShapCache.getObject("circle");
        Circle circle = (Circle) ShapeFactory.getShape("circle");
        circle.draw();
        System.out.println(circle);
    }
}
