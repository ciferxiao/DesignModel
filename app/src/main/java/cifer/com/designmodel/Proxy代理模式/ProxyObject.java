package cifer.com.designmodel.Proxy代理模式;

/**
 * Created by cifer on 2018/6/12 10:35.
 * 代理对象角色
 * 代理主题-因为ProxySubject引用了RealSubject,并且实现了跟RealSubject一样的接口,
 * 所以ProxySubject可以操作RealSubject,还可以提供一些附加操作
 */
public class ProxyObject implements InterObject {
    private InterObject interObject;

    public ProxyObject(InterObject minterobject){
        this.interObject = minterobject;
    }

    @Override
    public void doEexc() {
        if(interObject != null){
            interObject.doEexc();
        }
    }
}
