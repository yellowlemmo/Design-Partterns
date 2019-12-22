package SingleModle.LoginSingleModle;

/**
 * @ClassName: LoginSingleObject
 * @DESCRIPT: TODO 登记式单例模式 / 静态内部类 懒加载 线程安全
 * @TODO 由于静态内部类显示调用才会被classloader加载，所以获取singleObject是懒加载方式
 * @TODO 由于使用classloader方式加载所以是线程安全
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/12 10:51 PM
 **/
public class LoginSingleObject {

    private static class SingleHolder{
        private static final LoginSingleObject singleObject = new LoginSingleObject();
    }

    private LoginSingleObject(){};

    public LoginSingleObject getInstance(){
        return SingleHolder.singleObject;
    }

}
