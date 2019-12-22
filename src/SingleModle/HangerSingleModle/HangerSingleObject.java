package SingleModle.HangerSingleModle;

/**
 * @ClassName: HangerSingleObject
 * @DESCRIPT: TODO 饿汉式单例模式 线程安全
 * TODO 在类加载的时候就会实例化对象会产生垃圾对象浪费内存 没有真正意义的懒加载
 * TODO 没有加锁 效率高
 * TODO 基于classloader机制避免了多线程同步问题
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/12 9:31 PM
 **/
public class HangerSingleObject {
    private static HangerSingleObject hangerSingleObject = new HangerSingleObject();

    private  HangerSingleObject(){};

    public static HangerSingleObject getHangerInstance(){
        return hangerSingleObject;
    }
}
