package edu.gdut.demo.interfacedemo2;

public class PingPongSpoter extends Spoter implements English{

    public PingPongSpoter() {
    }

    public PingPongSpoter(String name, int age) {
        super(name, age);
    }


    @Override
    public void speakEnglish() {
        System.out.println("PingPongSpoter can speak English");
    }

    @Override
    public void study() {
        System.out.println("PingPongSpoter can play pingpong");
    }

    public String toString() {
        return "PingPongSpoter{ name = " + super.getName() + ", age = " + super.getAge() + "}";
    }
}
