package designmode.prototype;

import java.util.ArrayList;

/**
 * 一个对象需要提供给其他访问，这些访问者都可能需要改变其值，可以考虑使用原型模式拷贝多个
 * android Intent 和 Bundle
 */

public class Person implements Cloneable{

    private String name;
    private int age;
    private double height;
    private double weight;
    private ArrayList<String> hobbies ;

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.height = person.height;
        this.weight = person.weight;
        //this.hobbies = person.hobbies;这是浅拷贝，指向的同一个引用
        if(person.hobbies!=null){
            this.hobbies = new ArrayList<>(person.hobbies);
        }
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    protected Object clone()  {
        return new Person(this);
    }
}
