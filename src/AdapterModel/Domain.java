package AdapterModel;

import AdapterModel.Electric.ChainElectric;
import AdapterModel.Electric.Electric;
import AdapterModel.Power.ChainLandPower;
import AdapterModel.Power.ChainLandPowerImpl;
import AdapterModel.Power.HKPower;
import AdapterModel.Power.HKPowerImpl;


/**
 * @ClassName: Domain
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2020/1/2 10:33 PM
 **/
public class Domain {

    public static void main(String[] args){
        //初始化中国大陆电器
        Electric electric = new ChainElectric();
        //初始化中国大陆电源并连接大陆电器
        ChainLandPower chainLandPower = new ChainLandPowerImpl();
        electric.connect(chainLandPower);

        //初始化中国香港电源，中国大陆电源适配中国香港电源，连接
        HKPower hkPower = new HKPowerImpl();
        ChainLandPower adapterHKPower = new ChainLandPowerAdapterHKPower(hkPower);
        electric.connect(adapterHKPower);
    }
}
