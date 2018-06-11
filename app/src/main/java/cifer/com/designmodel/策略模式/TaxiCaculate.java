package cifer.com.designmodel.策略模式;

/**
 * Created by cifer on 2018/6/11 11:06.
 */
public class TaxiCaculate implements Strategy {
    @Override
    public int calculatePrice(int km) {
        return  2 * km;
    }
}
