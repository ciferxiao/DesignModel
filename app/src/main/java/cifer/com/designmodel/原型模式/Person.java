package cifer.com.designmodel.原型模式;

import java.util.ArrayList;

/**
 * Created by cifer on 2018/6/11 10:10.
 * 写法一
 */
public class Person  implements Cloneable{
    private String name;
    private int age;
    private float height;
    private float weight;

    private ArrayList<String> hobbies;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    @SuppressWarnings("unchecked")
    public Person clone(){
        Person person = null;
        try{
            person = (Person) super.clone();
            person.name=this.name;
            person.weight=this.weight;
            person.height=this.height;
            person.age=this.age;

            //深copy:
            person.hobbies = (ArrayList<String>)this.hobbies.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return person;
    }
}
