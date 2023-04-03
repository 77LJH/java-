package edu.gdut.demo.polymorphismDemo5;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }


    @Override
    public void eat(String food){
        System.out.println(getAge()+"岁的"+getColor()+"的狗🐕在吃"+food);
    }

    public void lookHome(){
        System.out.println("狗🐕在看家");
    }

    public String toString() {
        return "Dog{age = " + getAge() + ", color = " + getColor() + "}";
    }
}
