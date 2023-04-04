package edu.gdut.demo.interfacedemo2;

public class BasketballPlayer extends Spoter{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }


    @Override
    public void study() {
        System.out.println("BasketballPlayer can play basketball");
    }

    public String toString() {
        return "BasketballPlayer{ name = " + super.getName() + ", age = " + super.getAge() + " }";
    }
}

