package cifer.com.designmodel.策略模式;

/**
 * Created by cifer on 2018/6/11 11:06.
 */
public class BusCalculate implements Strategy{

    @Override
    public int calculatePrice(int km) {
        int busP = 2;
        if (km>5)
            busP = busP+km-5;
        return busP;
    }
}
