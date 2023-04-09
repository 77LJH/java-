package edu.gdut.demo;

public class Cat extends Animal {
    public Cat() {
        //super(); //默认调用父类无参构造方法
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }
}

