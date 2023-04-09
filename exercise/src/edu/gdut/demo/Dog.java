package edu.gdut.demo;

public class Dog extends Animal{
    public Dog() {
        //super(); //默认调用父类无参构造方法
    }

    public Dog(String name, int age) {
        //super(name, age);
    }

    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }
}
