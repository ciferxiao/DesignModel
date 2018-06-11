package cifer.com.designmodel.策略模式;

/**
 * Created by cifer on 2018/6/11 11:08.
 */
public class SubwayCalculate implements Strategy {
    @Override
    public int calculatePrice(int km) {
        int subwayP=0;
        if (km<5)
            subwayP = 3;
        if (km>5&&km<=10)
            subwayP=4;
        if (km>10)
            subwayP=5;
        return subwayP;
    }
}
