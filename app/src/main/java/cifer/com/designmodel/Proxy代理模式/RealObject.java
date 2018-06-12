package cifer.com.designmodel.Proxy代理模式;

import android.view.View;

/**
 * Created by cifer on 2018/6/12 10:34.
 * 目标对象角色
 * 真实主题-真实的对象,需要被代理主题引用
 */
public class RealObject implements InterObject{

    @Override
    public void doEexc() {
        System.out.println("执行操作");
    }

}
