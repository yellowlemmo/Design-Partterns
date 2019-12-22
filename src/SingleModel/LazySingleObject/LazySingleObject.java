package SingleModel.LazySingleObject;

/**
 * @ClassName: LazySingleObject
 * @DESCRIPT: TODO 懒汉式单例模式 线程不安全
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/12 9:20 PM
 **/
public class LazySingleObject {

    private static LazySingleObject  lazySingleObject;

    private LazySingleObject(){};

    public static LazySingleObject getLazySingleObjectInstance(){
        if(lazySingleObject == null){
            lazySingleObject = new LazySingleObject();
            return lazySingleObject;
        }
        return lazySingleObject;
    }
}
