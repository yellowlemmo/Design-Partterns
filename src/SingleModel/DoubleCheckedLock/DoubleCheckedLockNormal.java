package SingleModel.DoubleCheckedLock;

/**
 * @ClassName: DoubleCheckedLockNormal
 * @DESCRIPT: TODO 双重校验锁正确
 * TODO 使用volatile修饰doubleCheckedLockNormal为原子性
 * TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/12 10:30 PM
 **/
public class DoubleCheckedLockNormal {

    private static volatile DoubleCheckedLockNormal doubleCheckedLockNormal;

    private DoubleCheckedLockNormal(){};

    public static DoubleCheckedLockNormal getinstance(){
        if(doubleCheckedLockNormal == null){
            synchronized (DoubleCheckedLockNormal.class){
                if(doubleCheckedLockNormal == null){
                    doubleCheckedLockNormal = new DoubleCheckedLockNormal();
                    return doubleCheckedLockNormal;
                }
            }
        }
        return doubleCheckedLockNormal;
    }
}
