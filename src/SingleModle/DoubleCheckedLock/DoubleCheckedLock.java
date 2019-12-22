package SingleModle.DoubleCheckedLock;

/**
 * @ClassName: DoubleCheckedLock
 * @DESCRIPT: TODO 有坑的双重校验锁
 * TODO 可以看到同步代码块内外都有判断对象是否为空 理论上是没有问题
 * TODO 这种写法看似完美，实际上是有问题的
 * TODO java中new DoubleCheckedLock()不是原子性操作
 * TODO 1.分配对象的内存空间
 * TODO 2.初始化对象
 * TODO 3.设置instance指向刚分配的内存地址，当instance指向分配地址时，instance不为空
 * TODO 2、3部分顺序可能被重排序
 * TODO 试想一下创建对象的顺序变成1-3-2
 * TODO 线程A创建对象顺序为1-3-2当线程A给对象分配完内存后 线程B调用了getInstance方法
 * TODO 这时判断doubleCheckedLock != null 但是doubleCheckedLock并没有初始化
 * TODO 线程B会将为初始化完成的doubleCheckedLock返回，那么线程B使用doubleCheckedLock就会出现问题
 * TODO 这就是双重校验锁的问题
 * 当instance指向分配地址时，instance不为空
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/12 9:55 PM
 **/
public class DoubleCheckedLock {

    private static DoubleCheckedLock doubleCheckedLock;

    private DoubleCheckedLock(){};

    public static DoubleCheckedLock getInstance(){
        if(doubleCheckedLock == null){
            synchronized (DoubleCheckedLock.class){
                if(doubleCheckedLock == null){
                    doubleCheckedLock = new DoubleCheckedLock();
                    return doubleCheckedLock;
                }
            }
        }
        return doubleCheckedLock;
    }

}
