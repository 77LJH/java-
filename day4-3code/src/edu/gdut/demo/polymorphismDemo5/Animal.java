package edu.gdut.demo.polymorphismDemo5;

public class Animal {
    //属性：年龄，颜色
    //方法：吃
    private int age;
    private String color;

    public Animal(){

    }

    public void eat(String food){
        System.out.println("动物在吃"+food);
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Animal{age = " + age + ", color = " + color + "}";
    }
}
