package edu.gdut.demo.InheritanceDemo3;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int month) {
        super(name, month);
    }

    public void lookDoor() {
        System.out.println("狗看门");
    }
}