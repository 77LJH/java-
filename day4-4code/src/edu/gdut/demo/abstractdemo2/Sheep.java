package edu.gdut.demo.abstractdemo2;

public class Sheep extends Animal {

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("羊吃草");
    }

    public String toString() {
        return "Sheep{}";
    }
}

