package cifer.com.designmodel.原型模式;

import java.util.ArrayList;

/**
 * Created by cifer on 2018/6/11 10:34.
 * Arraylist 为深copy
 * 写法二
 */
public class Persons implements Cloneable{
    private String name;
    private int age;
    private float height;
    private float weight;

    private ArrayList<String> hobbies;

    public Persons(Persons persons){
        this.name=persons.name;
        this.weight=persons.weight;
        this.height=persons.height;
        this.age=persons.age;

        //深copy
        this.hobbies= new ArrayList<String>(hobbies);
    }

    @Override
    public Persons clone() {
        return new Persons(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
