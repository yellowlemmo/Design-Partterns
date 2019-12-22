package SingleModle.CommonSingle;

/**
 * @ClassName: Single
 * @DESCRIPT: TODO 普通单例模式
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/12 9:14 PM
 **/
public class SingleObject {

    private static SingleObject singleObject = new SingleObject();

    /**
     * 构造方法设置为private防止其他类实例化
     */
    private SingleObject(){};

    /**
     * 获取唯一可用的对象
     * @return
     */
    public static SingleObject getSingleObjectInstance(){
        return singleObject;
    }

    public void showMessage(){
        System.out.println("common single simple");
    }
}
