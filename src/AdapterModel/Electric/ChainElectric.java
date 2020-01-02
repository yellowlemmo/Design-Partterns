package AdapterModel.Electric;

import AdapterModel.Power.ChainLandPower;

/**
 * @ClassName: ChainElectric
 * @DESCRIPT: TODO 实现电器接口的连接中国大陆电源方法
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/2 10:26 PM
 **/
public class ChainElectric implements Electric{

    @Override
    public void connect(ChainLandPower chainLandPower) {
        chainLandPower.connect();
    }
}
