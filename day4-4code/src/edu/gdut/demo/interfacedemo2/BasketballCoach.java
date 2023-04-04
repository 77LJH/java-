package edu.gdut.demo.interfacedemo2;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }


    @Override
    public void teach() {
        System.out.println("BasketballCoach can teach basketball");
    }

    public String toString() {
        return "BasketballCoach{ name = " + super.getName() + ", age = " + super.getAge() + " }";
    }
}
