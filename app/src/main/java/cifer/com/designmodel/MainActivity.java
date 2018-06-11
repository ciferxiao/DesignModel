package cifer.com.designmodel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cifer.com.designmodel.BuilderModel.Person;
import cifer.com.designmodel.策略模式.PriceCaculator;
import cifer.com.designmodel.策略模式.PriceCaculator2;
import cifer.com.designmodel.策略模式.SubwayCalculate;

/**
 * Created by cifer on 2018/6/11 9:46.
 */
public class MainActivity  extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //single
        SingleModel singleModel = SingleModel.getSingleModel();

        //Builder
        cifer.com.designmodel.BuilderModel.Person.Builder builder = new cifer.com.designmodel.BuilderModel.Person.Builder();
        cifer.com.designmodel.BuilderModel.Person person = builder.age(1)
                .height(1)
                .name("xiao test")
                .weight(130)
                .build();

        //原型模式
        cifer.com.designmodel.原型模式.Person p=new cifer.com.designmodel.原型模式.Person();
        p.setAge(18);
        p.setName("张三");
        p.setHeight(178);
        p.setWeight(65);
        System.out.println(p);

        cifer.com.designmodel.原型模式.Person p1= (cifer.com.designmodel.原型模式.Person) p.clone();
        System.out.println(p1);

        p1.setName("李四");
        System.out.println(p);
        System.out.println(p1);
  /*    Person{name=’张三’, age=18, height=178.0, weight=65.0}
        Person{name=’张三’, age=18, height=178.0, weight=65.0}
        Person{name=’张三’, age=18, height=178.0, weight=65.0}
        Person{name=’李四’, age=18, height=178.0, weight=65.0}*/

        //策略模式
        //不使用策略模式：
        PriceCaculator priceCaculator = new PriceCaculator();
        int price = priceCaculator.getPrice(10,2);
        System.out.println(price);

        //使用策略模式：
        PriceCaculator2 priceCalculate2 = new PriceCaculator2();
        priceCalculate2.setStrategy(new SubwayCalculate());
        int price1 = priceCalculate2.getPrice(10);
        System.out.println(price1);

    }
}
