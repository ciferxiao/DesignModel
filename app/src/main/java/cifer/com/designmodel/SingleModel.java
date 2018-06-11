package cifer.com.designmodel;

/**
 * Created by cifer on 2018/6/11 9:47.
 * 单例模式 eg.
 */
public class SingleModel {
    private static volatile SingleModel instance;

    private SingleModel(){

    }

    public static SingleModel getSingleModel() {
        if(instance == null){
            synchronized (SingleModel.class){
                if(instance == null){
                    instance = new SingleModel();
                }
            }
        }
        return instance;
    }
}
