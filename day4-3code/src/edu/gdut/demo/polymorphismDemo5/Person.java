package edu.gdut.demo.polymorphismDemo5;

public class Person {

    //姓名，年龄
    private String name;
    private int age;

    public void keepPet(Animal animal, String food){

        if(animal instanceof Dog dog){
            System.out.println("年龄为"+age+"的"+name+"，养了一只"+dog.getAge()+"岁的"+dog.getColor()+"的"+"狗🐕");
            dog.eat(food);
            dog.lookHome();
        }else if(animal instanceof Cat cat){
            System.out.println("年龄为"+age+"的"+name+"，养了一只"+cat.getAge()+"岁的"+cat.getColor()+"的"+"猫🐱");
            cat.eat(food);
            cat.catchMouse();
        }else {
            System.out.println("没有这种动物");
        }
    }

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
