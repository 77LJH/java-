package edu.gdut.demo.InheritanceDemo3;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int month) {
        super(name, month);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

