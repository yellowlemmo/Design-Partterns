package SingleModel.EmunSingleModle;

/**
 * @ClassName: EmunSingleObject
 * @DESCRIPT: TODO 枚举方式实现单例模式
 * @AUTHOR: cuizhichao
 * @DATA: 2019/12/12 10:56 PM
 **/
public enum EnunSingleObject {

    INSTANCE;

    public void showMessage(){
        System.out.println("enum modle");
    }
}
