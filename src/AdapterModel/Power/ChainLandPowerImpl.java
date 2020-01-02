package AdapterModel.Power;

/**
 * @ClassName: ChainLandPowerImpl
 * @DESCRIPT: TODO 实现中国大陆电源接口
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/2 10:59 PM
 **/
public class ChainLandPowerImpl implements ChainLandPower{
    @Override
    public void connect() {
        System.out.println("connect with 220V");
    }
}
