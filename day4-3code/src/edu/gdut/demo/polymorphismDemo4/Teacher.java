package edu.gdut.demo.polymorphismDemo4;

public class Teacher extends Person{

    private String address="广州";
    @Override
    public void show(){
        System.out.println("Teacher {name="+getName()+", age="+getAge()+"address="+address+"}");
    }
}
