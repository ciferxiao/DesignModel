package cifer.com.designmodel.策略模式;

/**
 * Created by cifer on 2018/6/11 11:02.
 * 不使用策略模式
 * 场景：计算路程票价
 *缺点：如果增加一种方式，需要修改封装方法，增加if/switch判断
 */
public class PriceCaculator {
    public static final int BUS = 1;
    public static final int SUBWAY = 2;
    public static final int TAXI =3;


    private int busPrice(int km){
        int busP = 2;
        if (km>5)
            busP = busP+km-5;
        return busP;
    }

    private int subwayPrice(int km){
        int subwayP=0;
        if (km<5)
            subwayP = 3;
        if (km>5&&km<=10)
            subwayP=4;
        if (km>10)
            subwayP=5;
        return subwayP;
    }

    private int taxiPrice(int km) {
        return  2 * km;
    }

    public int getPrice(int km,int type){
        if (type==BUS)
            return busPrice(km);
        if (type == SUBWAY)
            return subwayPrice(km);
        if (type==TAXI)
            return taxiPrice(km);
        return 0;
    }

    //客户端调用
/*    public class Main {
        public static void main(String[] args) {
            PriceCaculator priceCaculator = new PriceCaculator();
            int price = priceCaculator.getPrice(10,2);
            System.out.println(price);
        }
    }*/

}
