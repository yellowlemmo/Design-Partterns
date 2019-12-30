package ProtoTypeModel.GenerateObject;

import ProtoTypeModel.ShapEntity.Circle;
import ProtoTypeModel.ShapEntity.Rectangle;
import ProtoTypeModel.ShapEntity.Square;
import ProtoTypeModel.Shape;

import java.util.HashMap;

/**
 * @ClassName: ShapCache
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/30 8:48 PM
 **/
public class ShapCache {
    private static HashMap<String, Shape> map = new HashMap<>();

    public static Shape getObject(String key) throws CloneNotSupportedException {
        Shape shape = map.get(key);
        return (Shape) shape.clone();
    }

    public static void loadObject(){
        Circle circle = new Circle();
        circle.setId("circle");
        map.put("circle",circle);

        Square square = new Square();
        square.setId("square");
        map.put("square",square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("rectangle");
        map.put("rectangle",rectangle);
    }
}
