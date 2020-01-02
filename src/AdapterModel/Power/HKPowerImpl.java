package AdapterModel.Power;

/**
 * @ClassName: HKPowerImpl
 * @DESCRIPT: TODO 实现中国香港接口
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/2 10:59 PM
 **/
public class HKPowerImpl implements HKPower{
    @Override
    public void connect() {
        System.out.println("connect with 110V");
    }
}
