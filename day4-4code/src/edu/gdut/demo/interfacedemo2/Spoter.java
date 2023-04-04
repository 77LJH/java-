package edu.gdut.demo.interfacedemo2;

public abstract class Spoter extends Person{


    public Spoter() {
    }

    public Spoter(String name, int age) {
        super(name, age);
    }

    public abstract void study() ;

    public String toString() {
        return "Spoter{}";
    }
}

