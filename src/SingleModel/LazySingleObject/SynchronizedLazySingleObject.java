package SingleModel.LazySingleObject;

/**
 * @ClassName: SynchronizedLazySingleObject
 * @DESCRIPT: TODO 懒汉式单例模式 线程安全99% 加锁效率低
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/12 9:25 PM
 **/
public class SynchronizedLazySingleObject {
    private static SynchronizedLazySingleObject synchronizedLazySingleObject;

    private SynchronizedLazySingleObject(){};

    public static synchronized SynchronizedLazySingleObject getSynchronizedInstantInstance(){
        if(synchronizedLazySingleObject == null){
            synchronizedLazySingleObject = new SynchronizedLazySingleObject();
            return synchronizedLazySingleObject;
        }
        return synchronizedLazySingleObject;
    }
}
