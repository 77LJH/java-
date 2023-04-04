package edu.gdut.demo.interfacedemo2;

public class PingPongCoach extends Coach implements English{

    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }


    @Override
    public void speakEnglish() {
        System.out.println("PingPongCoach can speak English");
    }

    @Override
    public void teach() {
        System.out.println("PingPongCoach can teach pingpong");
    }

    public String toString() {
        return "PingPongCoach{ name = " + super.getName() + ", age = " + super.getAge() + " }";
    }
}
