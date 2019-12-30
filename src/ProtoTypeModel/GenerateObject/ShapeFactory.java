package ProtoTypeModel.GenerateObject;

import ProtoTypeModel.Shape;

/**
 * @ClassName: ShapeFactory
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/30 9:12 PM
 **/
public class ShapeFactory {

    public static Object getShape(String key) throws CloneNotSupportedException {
           return ShapCache.getObject(key);
    }
}
