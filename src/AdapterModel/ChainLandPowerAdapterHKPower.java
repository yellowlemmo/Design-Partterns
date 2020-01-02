package AdapterModel;

import AdapterModel.Power.ChainLandPower;
import AdapterModel.Power.HKPower;

/**
 * @ClassName: PowerAdapter
 * @DESCRIPT: TODO 中国大陆电压兼容中国香港电压
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/2 10:27 PM
 **/
public class ChainLandPowerAdapterHKPower implements ChainLandPower {
    private HKPower hkPower;

    public ChainLandPowerAdapterHKPower(HKPower hkPower){
        this.hkPower = hkPower;
    }


    @Override
    public void connect() {
        hkPower.connect();
    }
}
