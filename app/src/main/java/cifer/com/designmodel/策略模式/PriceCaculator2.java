package cifer.com.designmodel.策略模式;

/**
 * Created by cifer on 2018/6/11 11:05.
 * 使用策略模式
 * 这里重点就是计算类了，可以看到里面的解法非常简便。
 * 而且如果要新增其他算法的话，直接实现一个接口就可以了，其他类都不需要变化。
 * 便于之后的升级或扩展。
 */
public class PriceCaculator2 {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int getPrice(int km){
        return strategy.calculatePrice(km);
    }

}
