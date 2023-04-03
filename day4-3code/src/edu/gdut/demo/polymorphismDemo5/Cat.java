package edu.gdut.demo.polymorphismDemo5;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food){
        System.out.println(getAge()+"岁的"+getColor()+"的猫🐱在吃"+food);
    }

    public void catchMouse(){
        System.out.println("猫🐱在捉老鼠");
    }

    public String toString() {
        return "Cat{age = " + getAge() + ", color = " + getColor() + "}";
    }
}
