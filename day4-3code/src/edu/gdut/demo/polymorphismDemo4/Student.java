package edu.gdut.demo.polymorphismDemo4;

public class Student extends Person{
//    public Student(String name,int age){
//        super(name,age);
//    }
    private String address="上海";

    @Override
    public void show(){
        System.out.println("Student {name="+getName()+", age="+getAge()+"address="+address+"}");
    }
}
